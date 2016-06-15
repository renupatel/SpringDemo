package com.test;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class TestClient {

	
	public static void main(String[] args) {
		
		//Resource r = new ClassPathResource("./resources/Spring.xml");
		// bean will created at user request only
		/*BeanFactory factory = new XmlBeanFactory(r);
		Test t = (Test) factory.getBean("t");*/
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/Spring.xml");
		
		
	}
}
