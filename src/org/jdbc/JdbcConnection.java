package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcConnection {
	// adding new method for git 
	
	private void git() {
	System.out.println("add a new line");

	}
	
	public static void main(String[] args) throws SQLException {
		
		Connection connection=null;
		
	
		try {
			
			//load driver -- throw exception
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//connect to database
			
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","admin");
			
			
			//sql query
			
			String sql="create table demo("
					+ "empid number(4) "
					+"empname varchar(20)"
					+"empsalary number(10)"
					+"empaddress varchar(30)"
					+"constraint c1 primarykey(empid)";
			
			//prepare statement
			
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			
			//execute query
			
			
			ResultSet executeQuery = prepareStatement.executeQuery();
			
			//iterate the report
		
			while(executeQuery.next()) { 
				
				
			
			}
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			
			connection.close();
		}
		
		
		
		
	}
	
	
	
	
	

}
