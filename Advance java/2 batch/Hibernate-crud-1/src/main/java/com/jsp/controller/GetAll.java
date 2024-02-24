package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Person;
import com.jsp.service.ServicePerson;

public class GetAll {

	public static void main(String[] args) {
		ServicePerson servicePerson = new ServicePerson();
		List<Person> list=servicePerson.getAllPerson();
		for(Person person:list) {
			System.out.println("person id:"+person.getId());
			System.out.println("person name:"+person.getName());
			System.out.println("person age:"+person.getAge());
			System.out.println("person phone:"+person.getPhone());
		}

	}

}
