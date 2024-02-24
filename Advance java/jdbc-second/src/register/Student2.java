package register;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class Student2 {

	public static void main(String[] args) {
				
		
		try {
			Properties properties=new Properties();
			
			FileInputStream fileInputStream= new FileInputStream("dbconfig.properties");
			
			properties.load(fileInputStream);
			
			DriverManager.registerDriver(new Driver());
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", properties);
			
			Statement statement=connection.createStatement();
			
			statement.execute("insert into student2 values(1,'Iconic','Mech')");
			
			connection.close();
			
			System.out.println("Succesfully inserted...!");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
			 
	}

}
