package register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class Test2 {

	public static void main(String[] args) {
		
		try {
			DriverManager.registerDriver(new Driver());
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			
			PreparedStatement preparedstatement= connection.prepareStatement("delete from student where id=?");
			
			preparedstatement.setInt(1,200);
			
			
			connection.close();
			
			System.out.println("Deleted");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
