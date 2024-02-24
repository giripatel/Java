package com.jsp.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;
@Component
public class StudentService {
	StudentDao studentDao = new StudentDao();
	
	public Student save(Student student) {
		return studentDao.saveStudent(student);
		
	}
	public Student update(Student student) {
		return studentDao.updateStudent(student);
	}
	public Student delete(int id) {
		return studentDao.deleteStudent(id);
	}
	public Student getById(int id) {
		return studentDao.getStudentById(id);
	}
	public List<Student> getAll() {
		return studentDao.getAllStudent();
	}
	/*
	 * public Student login(Student student) { return studentDao.login(student); }
	 */
}
