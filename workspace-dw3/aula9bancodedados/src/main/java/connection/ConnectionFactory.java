package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private Connection conn;
	
	public Connection getConnection() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/ifpr_store", "root", "bancodedados");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		return conn;
	}
}
