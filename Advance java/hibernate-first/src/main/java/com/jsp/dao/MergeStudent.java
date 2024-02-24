package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Student;

public class MergeStudent {
	public static void main(String[] args) {
		
	
		EntityManagerFactory emEntityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager emEntityManager = emEntityManagerFactory.createEntityManager();
		EntityTransaction etEntityTransaction = emEntityManager.getTransaction();
		
		Student student = emEntityManager.find(Student.class, 2);
		
		
		if(student != null) {
			
			student.setName("Raghu");
			student.setMarks(25);
			
			etEntityTransaction.begin();
			emEntityManager.merge(student);
			etEntityTransaction.begin();
			
			
		}else {
			System.out.println("Student data not found");
		}
}	
}



