package com.jsp;

import com.mysql.jdbc.Driver;
import java.sql.*;

public class Employee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DriverManager.registerDriver(new Driver());
			DriverManager.getConnection(null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
