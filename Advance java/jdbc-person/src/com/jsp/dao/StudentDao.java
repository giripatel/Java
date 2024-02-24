package com.jsp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jsp.dto.Student;

public class StudentDao {

//	public int saveStudent(List<Student> list) {
//
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_batch", "root","root");
//
//			PreparedStatement preparedStatement = connection.prepareStatement("inset into student values(?,?,?)");
//			
//			
//			preparedStatement.setInt(1, list.getId());
//			preparedStatement.setString(2,list.getName("nam"));
//			
//			preparedStatement.executeBatch();
//
//			connection.close();
//
//			return 0 ;
//
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return 0;
//	

//	}
//}
//
//
//		return 0;
//	}
public List<Student> getAllstudent() {
	
	
	List<Student> list = new ArrayList();
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_batch", "root","root");
		
		Statement statement = connection.createStatement();
		
		ResultSet r= statement.executeQuery("Select * from student ");
		
		while(r.next()) {
			Student student = new Student();
			
			student.setId(r.getInt(1));
			student.setName(r.getString(2));
			student.setAge(r.getInt(3));
			list.add(student);
		}
		connection.close();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return list;
}
//	public Student getStudentbyiId(int id) {
//		
//	}
	

}

	

