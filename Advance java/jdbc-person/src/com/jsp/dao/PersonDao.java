package com.jsp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.dto.Person;

public class PersonDao {

	public int savePerson(Person person) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_person", "root",
					"root");

			PreparedStatement preparedStatement = connection.prepareStatement("insert into person values(?,?,?,?)");
			int id = person.getId();
			String name = person.getName();
			int age = person.getAge();
			long phone = person.getPhone();

			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setInt(3, age);
			preparedStatement.setLong(4, phone);
			
			//or
			
//			preparedStatement.setInt(1,person.getId());
//			preparedStatement.setString(2,person.getName());
//			preparedStatement.setInt(3,person.getAge());
//			preparedStatement.setLong(4, person.getPhone());

			int res = preparedStatement.executeUpdate();

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

}
