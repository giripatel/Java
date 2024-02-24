package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Task1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			
			Statement statement =connection.createStatement();
			
			ResultSet r=statement.executeQuery("select * from student");
			
			while(r.next()) {
				
				System.out.println(r.getInt(1));
				System.out.println(r.getString(2));
				System.out.println(r.getInt(3));
			}
			
			connection.close();
			
			System.out.println(r);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
