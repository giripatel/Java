package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.jsp.dto.Teacher;
import com.jsp.util.MyConfig;

public class TestTeacher {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		Teacher teacher =(Teacher) applicationContext.getBean("teacher");
		teacher.dipslay();
	}
}
