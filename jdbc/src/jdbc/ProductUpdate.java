package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1. Load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
 
		// 2.Establish Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb", "root", "root");

//		3.create statements
		Statement statement = connection.createStatement();

//		4.Execute statements & process the results
		int result = statement.executeUpdate("update product set name='LAPTOP' where id=2");
		if (result != 0) {
			System.out.println("data Updated");
		} else {
			System.out.println("data not Updated");
		}

//		5.close connection
		connection.close(); 
	}

}
