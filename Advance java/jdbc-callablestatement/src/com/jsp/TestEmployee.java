package com.jsp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.Callable;


public class TestEmployee {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_callablestatement?user=root&password=root");
			
			CallableStatement callableStatement = connection.prepareCall("call first_code(?,?,?)");
			
			callableStatement.setInt(1,2 );
			callableStatement.setString(2, "ranjith");
			callableStatement.setDouble(3, 300000);
			
			callableStatement.setInt(1,3 );
			callableStatement.setString(2, "rakesh");
			callableStatement.setDouble(3, 300000);
			
			callableStatement.setInt(1,4 );
			callableStatement.setString(2, "rajhu");
			callableStatement.setDouble(3, 116);
			
			callableStatement.executeUpdate();
			
			connection.close();
			
			System.out.println("Table updated");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
