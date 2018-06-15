package com.chuix.springdemo.service.impl;

import java.util.Random;

import com.chuix.springdemo.service.BusinessService;

public class CloudServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\nAs organization, " + companyName + 
				"offer world class Cloud computing infrastructure." +
				"\nthe annual income exceeds " + random.nextInt(revenue) + " dollars.";
		return service;
	}
	
	public void postContruct() {
		System.out.println("CloudService: postConstruct called......................");
	}

	public void preDestroy() {
		System.out.println("CloudService: preDestroy called......................");
	}


}
