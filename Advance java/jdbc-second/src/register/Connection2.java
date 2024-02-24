	package register;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class Connection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties properties=new Properties();
		try {
			
			
			FileInputStream fileInputStream;
		  
			fileInputStream = new FileInputStream("dbconfig.properties");
			
			properties.load(fileInputStream);
			
			//or
			
			
			//properties.load(new FileInputStream("dbconfig.properties"))d
			DriverManager.registerDriver(new Driver());
			
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc",properties);
			
			
			
			System.out.println(connection);
		}
		 catch (SQLException e) {
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
