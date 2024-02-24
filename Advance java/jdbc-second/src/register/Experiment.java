package register;


import com.mysql.jdbc.Driver;
import java.sql.*;

public class Experiment {

			public static void main(String[] args) {
				
					try {
						Driver driver=new Driver();
						
						
							DriverManager.registerDriver(driver);
							
							Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/experiment","root", "root");
							
							Statement statement=connection.createStatement();
							
							statement.execute("create table e1 (t varchar primarykey not null)");
									
							
							connection.close();
							
							System.out.println("....");
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}

		}

	


