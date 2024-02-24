package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.dto.Person;

public class J2EECont2 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("injection2.xml");
		Person person=(Person) applicationContext.getBean("person");
		person.display();
	}
}
