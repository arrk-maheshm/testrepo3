package com.arrk.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class xml_bean_factory {

	
	public static void main(String[] args) {
	
		
		//XmlBeanFactory xbf=new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		
		ApplicationContext beanf=new ClassPathXmlApplicationContext("Beans.xml");
		person p=   (person) beanf.getBean("person_bean");
		
		p.show();	
		

	}

}
