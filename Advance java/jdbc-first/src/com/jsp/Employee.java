package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//import java.sql.*;



public class Employee {

	public static void main(String[] args) {
		
		try {
			//Step 1: load/register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Step 2: establish the connection
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
			//Step 3: establish the connection statement or create the statement
			Statement statement=connection.createStatement();
			//Step 4: execute the statement object
			statement.executeUpdate("update  jdbc.employee set sal=3000 where id=1;");

			//statement.executeUpdate("insert into jdbc.employee values(2,'Ranjith ',2000)");
			//statement.executeUpdate("insert into jdbc.employee values(3,'Mahesh',3000)");
			//Step 5: close the connection
			connection.close();
			System.out.println("succesful...");
			
		} 	catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			catch (SQLException e) {
		
				e.printStackTrace();
		}
		
		
	}

}
