package com.chuix.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chuix.springdemo.domain.Organization;


public class PropertiesWithXmlApp {

	public static void main(String[] args) {
		// Create the application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans-cp.xml");
		
		Organization org = (Organization) ctx.getBean("myorg");
		
		System.out.println(org);
		
		// close the application conext (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
