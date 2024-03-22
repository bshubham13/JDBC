package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		1.Load driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		2.Establish connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
		
//		3.create statement 
		Statement statement = connection.createStatement();
		
//		4.Execute statement & Process the results
		int result = statement.executeUpdate("delete from employee where id=4");
		if (result!=0) {
			System.out.println("Data Deleted");
		}else {
			System.out.println("Data not Deleted ");
		}
		
//		5.connection close 
		connection.close();
	}



	}


