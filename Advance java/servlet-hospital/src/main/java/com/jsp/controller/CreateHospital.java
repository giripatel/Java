package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Hospital;
import com.jsp.service.ServiceHospital;

@WebServlet("/save")
public class CreateHospital extends HttpServlet{
	Hospital hospital= new Hospital();
	ServiceHospital serviceHospital = new ServiceHospital();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		 String name = req.getParameter("name");
		 String website = req.getParameter("website");
		 long phone = Long.parseLong( req.getParameter("phone"));
		 
		 hospital.setName(name);
		 hospital.setWebsite(website);
		 hospital.setPhone(phone);
		 
		 Hospital hospital2 = serviceHospital.saveHospital(hospital);
		 
		 if(hospital2 != null) {
			req.getAttribute("hospial");
			RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");
			 dispatcher.forward(req, resp);
		 }else {
			 RequestDispatcher dispatcher=req.getRequestDispatcher("createhospital.jsp");
			 dispatcher.include(req, resp);
		 }
	
	}
}
