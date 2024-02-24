package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save")
public class SaveUserSerivce extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = new User();
		
		String name =req.getParameter("name") ;
		int age = Integer.parseInt(req.getParameter("age"));
		long phone = Long.parseLong(req.getParameter("phone"));
		
		user.setName(name);
		user.setAge(age);
		user.setPhone(phone);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("giri");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		
		if(user != null) {
			PrintWriter printWriter = resp.getWriter();
			printWriter.println("<html><body><h1>"+name+"</h1></body></html>");
		}
				
	}
}
