package com.jsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class Exe2 {

	public static void main(String[] args) {
		
		Properties properties = new Properties();
		
		try {
			FileInputStream fileInputStream = new FileInputStream("expconfic.properties");
			
				properties.load(fileInputStream);
				
				DriverManager.registerDriver(new Driver());
			
				Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", properties);
				
				PreparedStatement preparedStatement = connection.prepareStatement("Select * from student");
				
				
				ResultSet resultSet = preparedStatement.executeQuery();
							
				connection.close();
				
				System.out.println(resultSet);
		}
				
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		 }
				
		 catch (SQLException e) {
						// TODO Auto-generated catch block
				e.printStackTrace();
				}
		 

		}

}

