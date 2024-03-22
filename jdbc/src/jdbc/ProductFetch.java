package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductFetch {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1. Load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2.Establish Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb", "root", "root");

//		3.create statements
		Statement statement = connection.createStatement();

//		4.Execute statements & process the results
		ResultSet set = statement.executeQuery("SELECT * FROM PRODUCT");
		while (set.next()) {

			System.out.print(set.getInt("id") + "|");
			System.out.print(set.getString("name") + "|");
			System.out.print(set.getInt("price") + "|");
			System.out.print(set.getString("manufacturer") + "|");
			System.out.print(set.getInt("quantity") + "|");

			System.out.println(" ");
		}

//		5.close connection
		connection.close();
	}

}
