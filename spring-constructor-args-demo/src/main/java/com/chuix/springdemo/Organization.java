package com.chuix.springdemo;

public class Organization {
		
	private String companyName;
	private String yearOfIncorporation;

	/*public Organization() {
		
	}*/
	
	public Organization(String companyName, String yearOfIncorporation) {
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
	}

	public void corporateSlogan() {
		String slogan = "We build the utime driving machines!";
		System.out.println(slogan);
	}

	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation + "]";
	}
}
