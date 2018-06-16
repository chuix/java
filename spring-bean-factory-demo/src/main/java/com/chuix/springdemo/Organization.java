package com.chuix.springdemo;

public class Organization {
		
	private String companyName;
	private int yearOfIncorporation;

	/*public Organization() {
		
	}*/
	
	public Organization(String companyName, int yearOfIncorporation2) {
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation2;
	}

	public void corporateSlogan() {
		String slogan = "We build the utime driving machines!";
		System.out.println(slogan);
	}

	public static Organization createInstance(String companyName, int yearOfIncorporation) {
		System.out.println("Invoking the static factory method..................");
		return new Organization(companyName, yearOfIncorporation);
	}
	
	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation + "]";
	}
}
