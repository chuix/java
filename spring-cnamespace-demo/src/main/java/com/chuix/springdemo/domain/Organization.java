package com.chuix.springdemo.domain;

public class Organization {
		
	private String companyName;
	private String yearOfIncorporation;
	private Adress adress;

	public Organization(String companyName, String yearOfIncorporation, Adress adress) {
		super();
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation + ", adress="
				+ adress + "]";
	}
}
