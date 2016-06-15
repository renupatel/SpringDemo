package com.jdbc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class TestConnection {
	
	
	public static void main(String[] args) {
			
		Resource r = new ClassPathResource("./resources/spring.xml");
		BeanFactory factory = new XmlBeanFactory(r);
	Con2 con = (Con2)factory.getBean("con");
	//	con.save();
	}

}
