package com.controller;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.dto.*;

import java.util.List;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import java.util.regex.Pattern;
import java.io.IOException;

public class Onboarding {

	//static Logger logger = LogManager.getLogger(Onboarding.class);

	PasswordEncryption passwordEncryption = new PasswordEncryption();

	static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		Onboarding onboarding = new Onboarding();

		onboarding.onboarding();
	}

	public void onboarding() throws IOException {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		InputValidation inputValidation = new InputValidation();

		Employee employee = new Employee();

		Department department = new Department();

		employee.setId(inputValidation.employeeIdValidation());

		employee.setFirstName(inputValidation.employeeFirstNameValidation());

		employee.setLastName(inputValidation.employeeLastNameValidation());

		employee.setEmail(inputValidation.employeeEmailValidation());

		employee.setDesignation(inputValidation.employeeDesignationValidation());
		// logger.info("Enter department");
		// employee.setDepartment(department.setDepartmentName(inputValidation.employeeDepartmentValidation()));

		String departmentName = inputValidation.employeeDepartmentValidation();

		String newEmployeeDepartment = inputValidation.employeeDepartmentValidation();
		int departmentListCheck = 0;
		List<Department> departmentList = session.createQuery("select department from Department department").list();
		for (Department department1 : departmentList) {
			String departemtName = department1.getDepartmentName();
			if (departemtName == newEmployeeDepartment) {
				departmentListCheck++;
			}
		}
		if (departmentListCheck == 0) {

			department.setDepartmentName(newEmployeeDepartment);
			session.save(department);
			employee.setDepartment(department);

		} else {
				
		}
		employee.setLocation(inputValidation.employeeLocationValidation());

		employee.setSalary(inputValidation.employeeSalaryValidation());

		employee.setDateOfJoining(inputValidation.employeeDateValidation());

		employee.setPassword(passwordEncryption.passwordEncryption());

		department.getEmployees().add(employee);

		Transaction transaction = session.beginTransaction();

		session.save(employee);
		session.save(department);

		transaction.commit();

		logger.info("Data inserted successfully");

	}
}
