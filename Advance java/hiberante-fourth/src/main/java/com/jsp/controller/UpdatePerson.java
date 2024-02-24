package com.jsp.controller;

import com.jsp.dto.Person;
import com.jsp.service.ServicePerson;

public class UpdatePerson {
	public static void main(String[] args) {
		ServicePerson servicePerson = new ServicePerson();
		Person person = new Person();
		person.setId(3);
		person.setAge(19);
		person.setName("verra reddy");
		person.setPhone(7555291640l);
		Person person2 = servicePerson.updatePerson(person);
		if (person2 != null) {
			System.out.println("data updated");
		} else {
			System.out.println("dATA not updated");
		}
	}
}
