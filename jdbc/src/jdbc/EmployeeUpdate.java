package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeUpdate {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		1.Load the driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		2.Establish connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
		
//		3.create statement 
		Statement statement = connection.createStatement();
		
//		4.Execute statement & Process the results
		int result = statement.executeUpdate("update employee set name='HARSH' where id=4");
		if (result!=0) {
			System.out.println("Data Updated");
		}else {
			System.out.println("Data not Updated ");
		}
		
//		5.connection close 
		connection.close();
	}

}
