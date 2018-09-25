

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.sun.jna.platform.win32.DBT;

public class JDBCExample {

	public static void main(String[] args) {
		 
		 String dbUrl = "jdbc:mysql://127.0.0.1:3307/test"; //Connection URL
		 String username = "root"; //Database Username
		 String password = "";  //Database Password
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("MySQL JDBC Driver not found");
			e.printStackTrace();
			return;
		}

		System.out.println("MySQL JDBC Driver Registered!");
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(dbUrl, username,password);
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}

		if (connection != null) {
			System.out.println("Connection successful");
		} else {
			System.out.println("Connection Failed");
		}

	}

}
