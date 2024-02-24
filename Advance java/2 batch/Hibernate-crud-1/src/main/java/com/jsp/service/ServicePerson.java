package com.jsp.service;

import java.util.List;

import com.jsp.dao.PersonDao;
import com.jsp.dto.Person;

public class ServicePerson {
	PersonDao personDao= new  PersonDao(); 
	public Person savePerson(Person person) {
		return personDao.savePerson(person);	
	}
	public Person getPerson(int id) {
		return personDao.getById(id);	
	}
	public Person updatePerson(Person person) {
		return personDao.updatePerson(person);
	}
	public List<Person> getAllPerson() {
		return personDao.getAllPerson();
	}
	public Person getByPerson(int id) {
		return personDao.getById(id);
	}
	public Person deletePerson(int id) {
		return personDao.deletePerson(id);
	}

}
