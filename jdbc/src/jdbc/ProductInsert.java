package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1. Load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
 
		// 2.Establish Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb", "root", "root");

//		3.create statements
		Statement statement = connection.createStatement();

//		4.Execute statements & process the results
		int result = statement.executeUpdate("INSERT INTO PRODUCT VALUES (2,'MOBILE',50000,'APPLE',1),(3,'SOAP',40,'DOVE',4),(4,'LAPTOP',60000,'ASUS',1)");
		if (result != 0) {
			System.out.println("data inserted");
		} else {
			System.out.println("data not inserted");
		}

//		5.close connection
		connection.close();
	}

}
