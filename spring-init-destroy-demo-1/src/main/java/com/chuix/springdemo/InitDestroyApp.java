package com.chuix.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chuix.springdemo.domain.Organization;


public class InitDestroyApp {

	public static void main(String[] args) {
		// Create the application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans-cp.xml");
		/*
		// Create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		
		//invoke the company slogan via bean
		System.out.println(org.corporateSlogan());
		
		// pring organizations details
		System.out.println(org);
		
		System.out.println(org.corporateService());
		*/
		
		// close the application conext (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
