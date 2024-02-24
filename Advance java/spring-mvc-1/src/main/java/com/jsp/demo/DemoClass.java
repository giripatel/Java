package com.jsp.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoClass {
	@RequestMapping("/hello")
	public ModelAndView test() {
		ModelAndView andView = new ModelAndView("MySweet.jsp");
		andView.addObject("msg", "Welcome to springMVC Class");
		return andView;
	}
	@RequestMapping("/time")
	public ModelAndView call() {
		ModelAndView andView = new ModelAndView("MySweet.jsp");
		andView.addObject("time", LocalDateTime.now());
		return andView;
		
	}
	@RequestMapping("/date")
	public ModelAndView date() {
		ModelAndView andView = new ModelAndView("MySweet.jsp");
		andView.addObject("date", LocalDate.now());
		return andView;
		
	}
	@RequestMapping("/calldarling")
	public ModelAndView darling() {
		ModelAndView andView = new ModelAndView("Mystudent.jsp");
		Student student = new Student();
		student.setId(1);
		student.setName("Giri");
		student.setAge(22);
		andView.addObject("stu",student);
		return andView;
	
	}
	@RequestMapping("/get")
	public ModelAndView getAllStudents() {
		ModelAndView andView = new ModelAndView("GetAllstudent.jsp");
		List<Student> list = new ArrayList<Student>();
		
		Student student = new Student();
		student.setId(1);
		student.setName("Mahesh");
		student.setAge(22);
		list.add(student);
		
		Student student1 = new Student();
		student1.setId(2);
		student1.setName("Raghu");
		student1.setAge(22);
		list.add(student1);
		
		Student student2 = new Student();
		student2.setId(3);
		student2.setName("Sandeep");
		student2.setAge(23);
		list.add(student2);
		
		andView.addObject("student",list);

		return andView;
		
	}
	@RequestMapping("/load")
	public ModelAndView load() {
		ModelAndView andView = new ModelAndView("Register.jsp");
		andView.addObject("stu",new Student());
		return andView;
	}
	@RequestMapping("/save")
	public ModelAndView save(@ModelAttribute Student student) {
		ModelAndView andView = new ModelAndView("Mystudent.jsp");
		andView.addObject("stu",student);
		return andView;
	}
	
	
	
}