package com.jsp.controller;

import com.jsp.service.ServicePerson;

public class DeletePerson {
	public static void main(String[] args) {
		ServicePerson servicePerson = new ServicePerson();
		servicePerson.deletePerson(2);
	}
}
