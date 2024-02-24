package com.jsp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jsp.dto.Employee;
import com.mysql.cj.exceptions.RSAException;

public class EmployeeDao {
	public Employee saveEmployee(Employee emp) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/2b", "root", "root");

			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into employee values(?,?,?,?,?,?)");
			preparedStatement.setInt(1, emp.getId());
			preparedStatement.setString(2, emp.getName());
			preparedStatement.setLong(3, emp.getPhone());
			preparedStatement.setDouble(4, emp.getSal());
			preparedStatement.setString(5, emp.getEmail());
			preparedStatement.setString(6, emp.getPassword());

			preparedStatement.executeUpdate();

			connection.close();
			return emp;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
		return null;

	}

	public int updateEmployee(Employee emp) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/2b", "root", "root");

			PreparedStatement preparedStatement = connection
					.prepareStatement("update employee name=?,phone=?,sal=?,email=?,password=? where id=?");
			preparedStatement.setString(1, emp.getName());
			preparedStatement.setLong(2, emp.getPhone());
			preparedStatement.setDouble(3, emp.getSal());
			preparedStatement.setString(4, emp.getEmail());
			preparedStatement.setString(5, emp.getPassword());
			preparedStatement.setInt(6, emp.getId());

			int res=preparedStatement.executeUpdate();
			
			connection.close();
			return res;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}

	public Employee deleteEmployee(int id) {
		Employee employee = new Employee();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/2b", "root", "root");

			PreparedStatement preparedStatement = connection.prepareStatement("delete from employee where id=?");

			preparedStatement.setInt(1, id);

			int res= preparedStatement.executeUpdate();
			
			connection.close();
			return employee;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public List<Employee> getAllEmployee( ){
		Employee employee = new Employee();
		List<Employee> list = new ArrayList<Employee>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/2b", "root", "root");

			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery("select * from employee");
			
			while(resultSet.next()) {
				//Either this
				/*
				 * int id=resultSet.getInt(1); String name = resultSet.getString(2); long
				 * phone=resultSet.getLong(3); double sal = resultSet.getDouble(4); String email
				 * =resultSet.getString(5); String password = resultSet.getString(6);
				 */
				//or this 	
				employee.setId(resultSet.getInt(1));
				employee.setName(resultSet.getString(2));
				employee.setPhone(resultSet.getLong(3));
				employee.setSal(resultSet.getDouble(4));
				employee.setEmail(resultSet.getString(5));
				employee.setPassword(resultSet.getString(6));
				
				list.add(employee);
			}
			
			
			connection.close();
			return list;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public void createTable() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/2b", "root", "root");
			Statement statement = connection.createStatement();
			statement.execute("create table employee (id int primary key,name varchar(45),phone bigint(10),sal double,email varchar(45),password varchar(45))");
			connection.close();
			System.out.println("Table is Created...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
	}
	
}
