package com.chuix.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chuix.springdemo.domain.Organization;


public class CNamespaceApp {

	public static void main(String[] args) {
		// Create the application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans-cp.xml");
		
		// Create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		
		// pring organizations details
		System.out.println(org);
		
		// close the application conext (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
