package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.dto.User;

public class J2EECont1 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("injection.xml");
		User user  =(User)applicationContext.getBean("user1");
		user.display();
	
	}

}
