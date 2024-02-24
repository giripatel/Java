package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Person;


public class PersonDao {
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("raghu");
	public Person savePerson(Person person) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		if(person!=null) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		return person;
	}
		return  null;
	}
	public  Person getById(int id) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Person  person=entityManager.find(Person.class, id);
		if(person!=null) {
			return person;
		}
		return null;
	}
	public Person updatePerson(Person person ) {
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		//Person person2=entityManager.find(Person.class, person.getId());
		if(person !=null) {
			entityTransaction.begin();
			entityManager.merge(person);
			entityTransaction.getClass();
			return  person; 
		}
		return null;
	}
	public List <Person> getAllPerson() {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Person s");
		List<Person> list=query.getResultList();
		return list;	
	}
	public Person deletePerson(int id) {
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();
	Person person=entityManager.find(Person.class, id);
	if(person!=null) {
		entityTransaction.begin();
		entityManager.remove(person);
		entityTransaction.commit();
		return person;
	}
	return null;
	}
	
	
}
