package Indigo.EECS4413Project;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	public static Connection connect() {
		Connection conn = null;
		String url = "jdbc:h2:mem:h2db";
		String username = "sa";
		String password = "";
		try {
			conn = DriverManager.getConnection(url, username, password);			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}
}