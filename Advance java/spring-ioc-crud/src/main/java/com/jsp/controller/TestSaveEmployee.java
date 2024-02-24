 package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

import com.jsp.service.ServiceEmployee;
import com.jsp.util.MyConfig;

public class TestSaveEmployee {
	
	public static void main(String[] args) {
		Employee employee= new Employee();
		employee.setId(1);
		employee.setName("vinay");
		employee.setEmail("vinaykaka@gamil.com");
		employee.setPassword("idk");
		employee.setPhone(023456770l);
		employee.setSal(11444);
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		ServiceEmployee employeeService =(ServiceEmployee) applicationContext.getBean("serviceEmployee");
		Employee employee2 =  employeeService.saveEmployee(employee);
		if(employee2 != null) {
			System.out.println("Data Stored");
		}else {
			System.out.println("Chotu data check chey");
		}
	}
}
