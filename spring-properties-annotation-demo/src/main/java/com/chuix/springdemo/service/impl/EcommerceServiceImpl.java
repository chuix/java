package com.chuix.springdemo.service.impl;

import java.util.Random;

import com.chuix.springdemo.service.BusinessService;

public class EcommerceServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\nAs an organization" + companyName + 
				"provides an outstanding ecommerce platform." +
				"\nthe annual revenues exceeds " + random.nextInt(revenue) + " dollars.";
		return service;
	}

}
