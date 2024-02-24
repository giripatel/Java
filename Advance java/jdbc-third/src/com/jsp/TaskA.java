package com.jsp;

import java.sql.*;

public class TaskA {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			 
			PreparedStatement preparedstatement= connection.prepareStatement("insert into student2 values(?,?,?)");
			
			preparedstatement.setInt(1, 4);
			preparedstatement.setString(2, "Rakesh");
			preparedstatement.setInt(3, 22);
			
			preparedstatement.execute();
			
			connection.close();
			
			System.out.println("Data inserted...!");
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
