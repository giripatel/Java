package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dto.Employee;

@Component
public class EmployeeDao {
	@Autowired
	EntityManagerFactory entityManagerFactory;

	public Employee save(Employee employee) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction eTransaction = entityManager.getTransaction();

		if (employee != null) {
			eTransaction.begin();
			entityManager.persist(employee);
			eTransaction.commit();
		}
		return employee;
	}

	public Employee getEmployee(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(Employee.class, id);

	}

	public Employee deleteEmployee(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Employee employee = entityManager.find(Employee.class, id);
		if (employee != null) {
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
		}
		return employee;

	}

	public List<Employee> getAllEmployee() {

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("select s from Employee s");
		List<Employee> list = query.getResultList();
		if (list.size() > 0) {
			return list;
		}
		return null;
	}

	public Employee login(String email, String password) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("select s from Employee s where email=?1 and pasword=?2 ");
		query.setParameter(1, email);
		query.setParameter(2, password);
		Employee employee = (Employee) query.getSingleResult();
		if (employee != null) {
			return employee;
		}
		return null;
	}

	public Employee updateEmployee(Employee employee) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Employee employee2 = entityManager.find(Employee.class, employee.getId());
		if (employee2 != null) {
			entityTransaction.begin();
			entityManager.merge(employee);
			entityTransaction.commit();
			return employee2;
		}

		return null;
	}

}