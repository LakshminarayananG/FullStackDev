package com.practice.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class PreparedStatementTry {
	
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		
		try {
			
			// Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			
			// Establish connection using parameters
			 con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/emp_db","root","admin");
			
			System.out.println("value is "+con);
			
			 
			// Use case -New employee records to be stored
			// Create a statement
			String insertquery="insert into employees values(?,?,?)";
			 statement = con.prepareStatement(insertquery);
			 
			 //Pass parameter and execute query
			 statement.setInt(1, 107);
			 statement.setString(2, "Amy");
			 statement.setInt(3, 3500);
			 
			 //Execute the query
			int result= statement.executeUpdate();
			System.out.println(result);
						
			//Case 2 - Select query
			String select = "select * from employees";
			
			// Store results in resultset and return back the results
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
