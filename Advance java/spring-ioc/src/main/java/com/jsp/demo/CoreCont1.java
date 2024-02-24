package com.jsp.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;

public class CoreCont1 {
	public static void main(String[] args) {
//		Resource resource=new ClassPathResource("myspring.xml");
		//Another way to create resource 
		ClassPathResource classPathResource = new ClassPathResource("myspring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
		Student student = (Student)beanFactory.getBean("stu1");
		student.test();
		
	}
} 
  