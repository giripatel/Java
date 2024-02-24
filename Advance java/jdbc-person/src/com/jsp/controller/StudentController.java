package com.jsp.controller;

import java.sql.ResultSet;
import java.util.*;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentController {

	public static void main(String[] args) {
		List<Student> list = new ArrayList();
		
		
		StudentDao studentDao = new StudentDao();
		List l1=studentDao.getAllstudent();
		for(Student p:list ) {
			System.out.println("Student Id is"+p.getId());
			System.out.println("Student Name is"+p.getId());
			System.out.println("Student Age is"+p.getId());
			
		}
	}

}
