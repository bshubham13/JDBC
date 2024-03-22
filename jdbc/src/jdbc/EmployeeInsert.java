package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1. Load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2.Establish Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");

//		3.create statements
		Statement statement = connection.createStatement();

//		4.Execute statements & process the results
		int result = statement.executeUpdate("INSERT INTO EMPLOYEE VALUES (2,'BHAVIK',9834104745,40000,'NAGAR'),(3,'PRATHAM',9464104745,42000,'SOLAPUR'),(4,'HARSHAL',8834804745,45000,'SOLAPUR')");
		if (result != 0) {
			System.out.println("data inserted");
		} else {
			System.out.println("data not inserted");
		}

//		5.close connection
		connection.close();
	}

}
