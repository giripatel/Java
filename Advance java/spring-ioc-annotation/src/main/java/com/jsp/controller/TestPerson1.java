package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.jsp.dto.Person;
import com.jsp.util.MyConfig;

public class TestPerson1 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		Person person = (Person) applicationContext.getBean("person");
		person.display();
	}
}
