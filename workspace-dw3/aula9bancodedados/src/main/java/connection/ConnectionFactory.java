package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static Connection conn = null;

	//Singleton -> haverá apenas uma instância dessa classe para toda a aplicação
	public static Connection getConnection() {
		
		if (conn == null) {
			try {
				conn = DriverManager.getConnection("jdbc:mysql://localhost/ifpr_store", "root", "bancodedados");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}

		return conn;
	}
}
