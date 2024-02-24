package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Task1 extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Welcome to servlet");
		
		PrintWriter printWriter = res.getWriter();
		
		printWriter.println("<html><body><h1>Welcome to Jspiders </h1></body></html>");
	}

}
