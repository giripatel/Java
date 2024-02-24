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
@WebServlet("/delete")
public class DeleteHospital extends HttpServlet{
	Hospital hospital= new Hospital();
	ServiceHospital serviceHospital = new ServiceHospital();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
			int id = Integer.parseInt(req.getParameter("id"));
		 
			hospital.setId(id);
		 
		 Hospital hospital2 = serviceHospital.deleteHospital(id);
		 
		 if(hospital2 != null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");
			 dispatcher.forward(req, resp);
		 }else {
			 RequestDispatcher dispatcher=req.getRequestDispatcher("delete.jsp");
			 dispatcher.include(req, resp);
		 }
	
	}
}
