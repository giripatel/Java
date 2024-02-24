package com.jsp.controller;

import com.jsp.dao.PersonDao;
import com.jsp.dto.Person;

public class PersonController {

	public static void main(String[] args) {
		Person person = new Person();
		person.setId(3);
		person.setName("ranjith");
		person.setAge(22);
		person.setPhone(7032561056l);
		PersonDao personDao=new PersonDao();
		 int result=personDao.savePerson(person);
		 if(result>0) {
			 System.out.println("person data saved in database");
		 } else {
			 System.out.println(" No data Saved");
		 }
	}

}
