package register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exp {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			
			PreparedStatement preparedstament=connection.prepareStatement("create table student ( id varchar(45) primary key,"
					+ " name varchar(45) notnull,"
					+ "age number(5) notnull )");
					
			
			preparedstament.execute();
		
			connection.close();
			
			System.out.println("insreted ...!");
			
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

