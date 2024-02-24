package com.jsp.controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Employee;
import com.jsp.service.ServiceEmployee;
import com.jsp.util.MyConfig;

public class GetEmployee {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new  AnnotationConfigApplicationContext(MyConfig.class);
		ServiceEmployee serviceEmployee = (ServiceEmployee) applicationContext.getBean("serviceEmployee");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id");
		int id=sc.nextInt();
		Employee employee=serviceEmployee.getEmployee(id);
		if(employee!=null) {
			System.out.println("employee name : "+employee.getName());
			System.out.println("employee phone : "+employee.getPhone());
			System.out.println("employee sal : "+employee.getSal());
			System.out.println("employee email : "+employee.getEmail());
			System.out.println("employee password : "+employee.getPassword());


		}
		
	}

}