package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import connection.ConnectionFactory;


public class ConnectionTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Connection conn = ConnectionFactory.getConnection();
		
		try {
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM products");
			ResultSet listaBd = stmt.executeQuery();
			
			while (listaBd.next()) {
                Integer id = listaBd.getInt("id");
                String name = listaBd.getString("name");
                Double preco = listaBd.getDouble("price");
                
                System.out.println(id + "," + name + "," + preco);
            }
					
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}