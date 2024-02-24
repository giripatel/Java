package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Student;

public class AllStudent {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select s from Student s where name=?1 ");
		query.setParameter(1, "ranjith");
		
		List<Student> list = query.getResultList();
		
		for(Student student : list) {
			System.out.println("Student Id : " +student.getId());
			System.out.println("Student Id : " +student.getName());
			System.out.println("Student Id : " +student.getMarks());
			System.out.println("------------------------------------------------------");
		}
		
	
	}
}
