package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.dto.Car;

public class J2EECont3 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("injection3.xml");
		Car car =(Car)applicationContext.getBean("car");
		car.carRide();
	}
}
