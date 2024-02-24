package com.jsp.dto;

import java.util.ArrayList;

public class Person {
	int id;
	String name;
	long phone;
	
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public void display() {
		System.out.println(" Person Id :"+id);
		System.out.println(" Person Name:"+name);
		System.out.println(" Person Phone:"+phone);
	}
	
}
