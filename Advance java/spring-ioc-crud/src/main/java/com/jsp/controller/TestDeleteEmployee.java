package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Employee;

import com.jsp.service.ServiceEmployee;
import com.jsp.util.MyConfig;

public class TestDeleteEmployee {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		ServiceEmployee serviceEmployee =(ServiceEmployee) applicationContext.getBean("serviceEmployee");
		Employee employee2 =  serviceEmployee.deletreEmployee(2);
		if(employee2 != null) {
			System.out.println("Data Stored");
		}else {
			System.out.println("Chotu data check chey");
		}
		
		
	}
}
