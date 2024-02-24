package com.jsp.dao;

import java.util.List;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.User;

public class UserDao {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("task");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
//		Query query = entityManager.createQuery("select s from User s  where loginid=?1 and password=?2");
//		query.setParameter(1, "ranjith_patel");
//		query.setParameter(2, "ranjithxxx");
		
		Query query = entityManager.createQuery("select s from User s  where loginid=:login and password=:pass");
		query.setParameter("login", "giri_iconic");
		query.setParameter("pass", "girixxx");
		
		List<User> list= query.getResultList();
		
		for(User u : list) {
			System.out.println("Student Id : " +u.getId());
			System.out.println("Student Id : " +u.getName());
			System.out.println("Student Id : " +u.getAge());
			System.out.println("Student Id : " +u.getLoginid());
			System.out.println("Student Id : " +u.getPassword());
			System.out.println("------------------------------------------------------");
		}
			
	}

}
