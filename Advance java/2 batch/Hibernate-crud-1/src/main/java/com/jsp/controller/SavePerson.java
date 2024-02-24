package com.jsp.controller;

import com.jsp.dto.Person;
import com.jsp.service.ServicePerson;

public class SavePerson {

	public static void main(String[] args) {
		ServicePerson servicePerson = new ServicePerson();
		Person person = new Person();
		person.setId(2);
		person.setName("Sai kumar reddy");
		person.setAge(21);
		person.setPhone(9550652706l);
		Person	person2=servicePerson.savePerson(person);
		if(person2 != null) {
			System.out.println("person id:"+person2.getId());
			System.out.println("person id:"+person2.getName());
			System.out.println("person id:"+person2.getAge());
			System.out.println("person id:"+person2.getPhone());
		}
	}

}
