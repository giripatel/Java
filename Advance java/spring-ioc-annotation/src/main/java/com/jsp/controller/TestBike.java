package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Bike;
import com.jsp.util.MyConfig;

public class TestBike {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		Bike bike =(Bike) applicationContext.getBean("bike");
		bike.testRide();
		
	}
}
