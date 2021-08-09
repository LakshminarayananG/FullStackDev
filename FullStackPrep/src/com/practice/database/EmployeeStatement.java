package com.practice.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class EmployeeStatement {

	
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			
			// 1. Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			
			// 2. Establish connection using parameters
			 con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/emp_db","root","admin");
			
			System.out.println("value is "+con);
			
			 
			// Use case -New employee records to be stored
			//3. Create a statement
			
			 statement = con.createStatement();
			
			// 4. Create the sql query
			String insertquery="insert into employees values(105,'Diksha',2500)";
			
			//5. Execute the statement
			statement.execute(insertquery);
			
			
			//Case 2 - Select query
			String select = "select * from employees";
			
			//6. Store results in resultset and return back the results
			resultSet = statement.executeQuery(select);
			
			Set<Employee> set = new HashSet<>();
			Set<String> nameset = new HashSet<>();
			while(resultSet.next()) {
				Employee empl = new Employee();
				empl.setId(resultSet.getInt(1));
				empl.setName(resultSet.getString(2));
				empl.setSalary(resultSet.getInt(3));
				set.add(empl);
				nameset.add(resultSet.getString(2));
			}
			
			System.out.println(set);
			System.out.println(nameset);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			resultSet.close();
			statement.close();
			con.close();
			
			
		}
		
		
	}
}
