package register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			
			PreparedStatement preparedstament=connection.prepareStatement("create table Ranjit ( student varchar(45) primary key )");
					
			
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
