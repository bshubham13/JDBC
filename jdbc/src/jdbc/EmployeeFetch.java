package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeFetch {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		1.Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

//		2.Establish connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");

//		3.create statement
		Statement statement = connection.createStatement();

//		4.Execute stament & process the result 
		ResultSet set = statement.executeQuery("SELECT * FROM EMPLOYEE");
		while (set.next()) {
			System.out.print(set.getInt("id")+" ");
			System.out.print(set.getString("name")+ " ");
			System.out.print(set.getLong("phone")+" ");
			System.out.print(set.getDouble("salary")+" ");
			System.out.print(set.getString("address")+" ");

			System.out.println(" ");
		}

//		5.close connection
		connection.close();
	}

}
