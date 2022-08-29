package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static Connection conn = null;

	//Singleton -> haverá apenas uma instância dessa classe para toda a aplicação
	public static Connection getConnection() throws ClassNotFoundException {
		
		if (conn == null) {
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost/ifpr_store", "root", "bancodedados");
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				throw new RuntimeException(e.getMessage());
			}
		}

		return conn;
	}
	
	public static void close() {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
	}
}
