package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Employee;
import com.jsp.service.ServiceEmployee;
import com.jsp.util.MyConfig;

public class UpdateEmployee {
	
	public static void main(String[] args) {
		Employee employee =new Employee();
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		ServiceEmployee serviceEmployee= (ServiceEmployee) applicationContext.getBean("serviceEmployee");
		employee.setId(1);
		employee.setName("raghu");
		employee.setEmail("raghureddy6633@gmail.com");
		employee.setPassword("raghu@6633");
		employee.setPhone(8247735252l);
		employee.setSal(30000);
		Employee employee5=serviceEmployee.updateEmployee(employee);
		if(employee5!=null) {
			System.out.println("employee name:"+employee5.getName());
		}
		
	}

}