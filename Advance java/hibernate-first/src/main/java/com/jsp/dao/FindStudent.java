package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jsp.dto.Student;

public class FindStudent {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Student student = entityManager.find(Student.class, 1);

		if (student != null) {

			System.out.println("Studnt Id : " + student.getId());
			System.out.println("Studnt Name : " + student.getName());
			System.out.println("Studnt Marks " + student.getMarks());
		}
		
	}

}
