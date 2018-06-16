package com.chuix.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeanRefactoryApp {

	public static void main(String[] args) {
		// Create the application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans-cp.xml");
		
		// Create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		Organization org2 = (Organization) ctx.getBean("myorg2");
		
		//invoke the company slogan via bean
//		org.corporateSlogan();
		
		// pring organizations details
		System.out.println(org);
		System.out.println(org2);
		
		// close the application conext (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
