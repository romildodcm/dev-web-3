package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionFactory;
import models.Product;

public class ProductRepository implements IProductRepository {
	
	private Connection conn;
	
	public ProductRepository() {
		try {
			conn = ConnectionFactory.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.print(e.getMessage());
		}
	}

	@Override
	public Integer insert(Product product) {
		PreparedStatement stmt = null;
		int id = 0;
		
		try {
			String sql = "INSERT INTO products (name, price, description, imageUri) VALUES (?, ?, ?, ?)";
			stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			
			stmt.setString(1, product.getName());
			stmt.setDouble(2, product.getPrice());
			stmt.setString(3, product.getDescription());
			stmt.setString(4, product.getImageUri());
			
			// todas operações que não retornam algum tipo de dado (insert, update, delete, etc)
			int rowsAffected = stmt.executeUpdate();
			
			if (rowsAffected > 0) {
				ResultSet ids = stmt.getGeneratedKeys();
				
				while(ids.next()) {
					id = ids.getInt(1);
					
					System.out.println("OK! ids generated: " + id);
				}
			}
			
			System.out.println("Rows affected: " + rowsAffected);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Integer update(Product product) {
		PreparedStatement stmt = null;
		int rowsAffected = 0;
		
		try {
			String sql = "UPDATE products SET name = ?, price = ?, description = ?, imageUri = ? WHERE id = ?";
			stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, product.getName());
			stmt.setDouble(2, product.getPrice());
			stmt.setString(3, product.getDescription());
			stmt.setString(4, product.getImageUri());
			stmt.setInt(5, product.getId());
			
			rowsAffected = stmt.executeUpdate();
			
			System.out.println("rowsAffected: " + rowsAffected);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Integer deleteById(Integer id) {
		PreparedStatement stmt = null;
		
		try {
			String sql = "DELETE FROM products WHERE (id = ?)";
			stmt = conn.prepareStatement(sql);
			
			stmt.setInt(1,  id);
			
			int rowsAffected = stmt.executeUpdate();
			
			System.out.println("rowsAffected: " + rowsAffected);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return id;
	}

	@Override
	public List<Product> findAll() {
		List<Product> products = new ArrayList<Product>();
		
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		try {
			stmt = conn.prepareStatement("SELECT * FROM products");
			
			result = stmt.executeQuery();
			
			while(result.next()) {
				Integer id = result.getInt("id");
				String name = result.getString("name");
				Double price = result.getDouble("price");
				String description = result.getString("description");
				String imageUri = result.getString("imageUri");
				
				Product p = new Product(id, name, price, description, imageUri);
				
				//debug
				//if(id == null) {
				//	System.out.println("NULL");
				//} else {
				//	System.out.println(id + "," + name);
				//}
				
				products.add(p);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} 
		finally {
			
			try {
				//conn.close();
				stmt.close();
				result.close();
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
		
		return products;
	}

	@Override
	public Product findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
