package com.jsp.dto;

public class User {
	int id;
	String name;
	int age;
	
	
	public User(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public void display() {
		System.out.println("User id :" +id);
		System.out.println("User name :"+name);
		System.out.println("User age :"+age);
	}
	
	
}
