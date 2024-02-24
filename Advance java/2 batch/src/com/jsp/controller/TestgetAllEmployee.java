package com.jsp.controller;

import java.util.List;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class TestgetAllEmployee {
	public static void main(String[] args) {
		EmployeeDao employeeDao = new EmployeeDao();
		List<Employee> list = employeeDao.getAllEmployee();
		for(Employee e : list) {
			System.out.println("Employee Id : "+e.getId());
			System.out.println("Employee Name : "+e.getName());
			System.out.println("Employee Phone :"+e.getPhone());
			System.out.println("Employee Salaray");
		}
	}
}
