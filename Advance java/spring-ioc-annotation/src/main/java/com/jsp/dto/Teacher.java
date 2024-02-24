package com.jsp.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
	int id;
	String name;
	double sal;
	@Value(value = "1")
	public void setId( int id) {
		this.id = id;
	}

	@Value(value = "Raju")
	public void setName(String name) {
		this.name = name;
	}

	@Value(value = "120.1201")
	public void setSal(double sal) {
		this.sal = sal;
	}

	// Teacher(){
//		
//	}
//	public Teacher(@Value(value = "1") int id,@Value(value = "Reels") String name,@Value(value = "116.1") double sal) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.sal = sal;
//	}

	public void dipslay() {
		System.out.println("Id :" + id);
		System.out.println("Name :" + name);
		System.out.println("Salary :" + sal);
	}
}
