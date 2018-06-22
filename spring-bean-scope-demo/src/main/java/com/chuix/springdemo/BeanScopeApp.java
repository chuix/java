package com.chuix.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chuix.springdemo.domain.Organization;


public class BeanScopeApp {

	public static void main(String[] args) {
		// Create the application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans-cp.xml");
		
		// Create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		Organization org2 = (Organization) ctx.getBean("myorg");
		org2.setPostalCode("98989");
		
		//invoke the company slogan via bean
		//System.out.println(org.corporateSlogan());
		
		// pring organizations details
		System.out.println(org);
		System.out.println(org2);
		
		if(org == org2) {
			System.out.println("Sigleton scope test: org and org2 point to the same instance.");
		}
		else {
			System.out.println("Both org and org2 are diferents objects");
		}
		
		System.out.println(org.corporateService());
		
		// close the application conext (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
