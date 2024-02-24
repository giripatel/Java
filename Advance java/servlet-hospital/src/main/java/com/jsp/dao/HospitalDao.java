package com.jsp.dao;

import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Hospital;

public class HospitalDao {
	public Hospital saveHospital(Hospital hospital) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("giri");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		if (hospital != null) {
			entityTransaction.begin();
			entityManager.persist(hospital);
			entityTransaction.commit();
			return hospital;
		}
		return null;
	}

	public Hospital updateHospital(int id, Hospital hospital) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("giri");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Hospital hospital2 = entityManager.find(Hospital.class, id);
		if (hospital != null) {
			entityTransaction.begin();
			entityManager.merge(hospital);
			entityTransaction.commit();
			return hospital2;
		}
		return null;
	}

	public Hospital deleteHospital(int id) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("giri");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Hospital hospital = entityManager.find(Hospital.class, id);
		if (hospital != null) {

			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();

			return hospital;
		}
		return null;
	}

	public int searchHospital(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("giri");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		if (id != 0) {
			entityManager.find(Hospital.class, id);
			return id;
		}
		return 0;

	}

	public List<Hospital> displayHosptial() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("giri");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Query query = entityManager.createQuery("select s from Hospital s");
		List<Hospital> list = query.getResultList();
		if (list != null) {
			return list;
		}
		return null;
	}
	public Hospital editHospital(int id, Hospital hospital) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("giri");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Hospital hospital2 = entityManager.find(Hospital.class, id);
		if (hospital != null) {
			entityTransaction.begin();
			entityManager.merge(hospital);
			entityTransaction.commit();
			return hospital2;
		}
		return null;
	}

}
