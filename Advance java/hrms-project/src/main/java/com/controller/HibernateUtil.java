package com.controller;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.dto.*;
//import dto.ResignedEmployee;

//This class is a utility class in which the session factory object is created 
public class HibernateUtil{
	
	/*	
	*Making the session factory as singleton so that multiple objects of the session factory are not created because the 
	*session factoy is heavy weight .Creating multiple session factory objects will slow the application
 	*/
	private static SessionFactory sessionFactory=null;
	
	//This method creates the object of session factory if the session factory object is already not created and the returns the object
	public static SessionFactory getSessionFactory(){
		
	if(sessionFactory==null){

		Configuration configuration = new Configuration();

		//configure method is resposible for reading the configuration file and using the data of it to creating the session factory object
		configuration.configure();

		configuration.addAnnotatedClass(Employee.class);
		configuration.addAnnotatedClass(Department.class);

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

		sessionFactory=configuration.buildSessionFactory(serviceRegistry);
	}
	return sessionFactory;	
}

}