package com.jsp.controller;

import com.jsp.dto.Person;
import com.jsp.service.ServicePerson;

public class GetById {

	public static void main(String[] args) {
		ServicePerson servicePerson = new ServicePerson();
		Person  person= servicePerson.getByPerson(3);
		if(person !=null) {
			System.out.println("person id:"+person.getId());
			System.out.println("person name:"+person.getName());
			System.out.println("person age:"+person.getAge());
			System.out.println("person phone:"+person.getPhone());
		}
	}

}
