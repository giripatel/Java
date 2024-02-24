package com.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

@Component
public class ServiceEmployee {
	@Autowired
	EmployeeDao employeeDao;

	public Employee saveEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	public Employee getEmployee(int id) {
		return employeeDao.getEmployee(id);
	}

	public Employee deletreEmployee(int id) {
		return employeeDao.deleteEmployee(id);
	}
	public List<Employee> getAllEmployee(){
		return employeeDao.getAllEmployee();
	}
	public Employee login(String email,String password){
		return employeeDao.login(email, password);
	}
	public Employee updateEmployee(Employee employee) {
		return employeeDao.updateEmployee(employee);
	}
}