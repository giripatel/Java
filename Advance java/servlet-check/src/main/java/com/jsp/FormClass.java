package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/form")
public class FormClass extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		int id=Integer.parseInt(req.getParameter("id"));
		
//		System.out.println(email);
//		System.out.println(pass);
//		System.out.println(id);
		
		PrintWriter printWriter = res.getWriter();
		printWriter.println("<html><body><h1>"+id+"</h1><br><h1>"+email+"</h1><br><h1>"+pass+"</h1></body></html>");
		
	}

}
