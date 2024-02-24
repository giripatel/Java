package com.jsp.util;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jsp.dto.Student;

@Configuration
@ComponentScan(basePackages ="com.jsp")
public class MyConfig {
	@Bean //when we use inbuilt classes we can't use annotation Component so we using  Bean
	public Student create() {
		return  new Student();
	}
}

