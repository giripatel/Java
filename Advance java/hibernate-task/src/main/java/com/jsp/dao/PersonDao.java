package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonDao {

		public static void main(String[] args) {
			
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("task");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println(entityManager);
		
	}
}
