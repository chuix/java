package com.chuix.springdemo.domain;

public class Organization {
		
	private String companyName;
	private String yearOfIncorporation;
	private Adress adress;

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setYearOfIncorporation(String yearOfIncorporation) {
		this.yearOfIncorporation = yearOfIncorporation;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation + ", adress="
				+ adress + "]";
	}
}
