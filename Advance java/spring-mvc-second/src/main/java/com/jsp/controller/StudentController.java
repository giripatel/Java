package com.jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class StudentController {
	@Autowired
	StudentService service;

	@RequestMapping("/load")
	public ModelAndView loadStudent() {
		ModelAndView andView = new ModelAndView("Home.jsp");
		return andView.addObject("student", new Student());
	}

	@RequestMapping("/save")
	public ModelAndView saveStudent() {
		ModelAndView andView = new ModelAndView();
		return andView.addObject("student", new Student());
	}
}
