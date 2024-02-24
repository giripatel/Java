package register;


import com.mysql.jdbc.Driver;
import java.sql.*;

public class Student {

	public static void main(String[] args) {
		
			try {
				Driver driver=new Driver();
				
				{
					DriverManager.registerDriver(driver);
					
					Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root", "root");
					
					Statement statement=connection.createStatement();
					
					statement.execute("insert into student values(2,'Ranjith',22)");
					
					connection.close();
					
					System.out.println("Student details updated");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
