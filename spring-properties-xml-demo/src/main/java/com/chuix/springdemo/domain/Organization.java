package com.chuix.springdemo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.chuix.springdemo.service.BusinessService;

public class Organization {
		
	private String companyName;
	private String yearOfIncorporation;
	
	@Value("${org.postalCode}")
	private String postalCode;
	
	private int employeeCount;
	private String slogan;
	private BusinessService businessService;

	public Organization() {
		System.out.println("Default constructor called");
	}
	
	public Organization(String companyName, String yearOfIncorporation) {
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
		System.out.println("Constructor called");
	}

	/*
	public void initialize() {
		System.out.println("Organization: initialize method called");
	}

	public void destroy() {
		System.out.println("Organization: destroy method called");
	}
*/

	public void postContruct() {
		System.out.println("Organization: postConstruct called......................");
	}

	public void preDestroy() {
		System.out.println("Organization: preDestroy called......................");
	}

	
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
		System.out.println("setPostalCode called");
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
		System.out.println("setEmployeeCount called");
	}

	@Autowired
	public void setSlogan(@Value("${org.slogan}") String slogan) {
		this.slogan = slogan;
		System.out.println("setSlogan called");
	}

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
		System.out.println("setBusinessService called");
	}

	public String corporateSlogan() {
			return slogan;
	}

	public String corporateService() {
		return businessService.offerService(companyName);
	}
	
	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation
				+ ", postalCode=" + postalCode + ", employeeCount=" + employeeCount + ", slogan=" + slogan + "]";
	}
}
