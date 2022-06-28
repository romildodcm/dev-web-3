package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;

import connection.ConnectionFactory;

public class ConnectionTest {
	public static void main(String[] args) {
		ConnectionFactory factory = new ConnectionFactory();
		
		Connection conn = factory.getConnection();
		
		try {
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM products");
			ResultSet produtos = stmt.executeQuery();
			
			while (produtos.next()) {
                System.out.println(produtos.ge)
            }
					
					
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
