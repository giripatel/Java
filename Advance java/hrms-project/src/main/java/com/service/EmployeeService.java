package com.service;

import com.dao.EmployeeDao;
import com.dto.Employee;

public class EmployeeService {
	EmployeeDao employeeDao=new EmployeeDao();
	
	public Employee saveEmployee(Employee employee) {
		return employeeDao.saveEmployee(employee);
	}
}
