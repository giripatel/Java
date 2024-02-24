package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Hospital;

public class HospitalDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("giri");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	public Hospital saveHospital(Hospital hospital) {
		
		if(hospital != null) {
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
		return hospital;
		}
		return null;
	}
	public Hospital updateHospital(Hospital hospital,int id) {
		Hospital hospital2=entityManager.find(Hospital.class, id);
		if(hospital2!=null) {
			entityTransaction.begin();
			entityManager.merge(hospital2);
			entityTransaction.commit();
			return hospital2;
		}
		return null;
	}
	public int deleteHospital(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("giri");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		if(id != 0) {
			entityTransaction.begin();
			entityManager.remove(id);
			entityTransaction.commit();
			return id;
		}
		return 0;
	}
}
