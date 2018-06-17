package com.chuix.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chuix.springdemo.domain.promotion.TradeFair;


public class ComponentAnnotationApp {

	public static void main(String[] args) {
		// Create the application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans-cp.xml");
		
		TradeFair tradeFair = (TradeFair) ctx.getBean("myfair");
		
		System.out.println(tradeFair.specialPromotionalPricing());
		
		// close the application conext (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
