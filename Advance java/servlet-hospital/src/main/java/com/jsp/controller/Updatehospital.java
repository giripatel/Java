package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.HospitalDao;
import com.jsp.dto.Hospital;

@WebServlet("/update")
public class Updatehospital extends HttpServlet{
	
			Hospital hospital = new Hospital();
			HospitalDao hospitalDao = new HospitalDao();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		
		hospital.setId(id);
		
		Hospital hospital2 = hospitalDao.updateHospital(id, hospital);
		
		if(id != 0) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("edit.jsp");
			dispatcher.forward(req, resp);
		}else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("updatehospital.jsp");
			dispatcher.include(req, resp);;
		}
	}
}
