package com.Aravind;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Application {

	public static void main(String[] args) {
		// Using Constructor we are using BeanFactory
		Resource rs = new ClassPathResource("avi.xml");
		BeanFactory bf = new XmlBeanFactory(rs);
		Collection c = bf.getBean("avi",Collection.class);
		c.display();

	}

}
