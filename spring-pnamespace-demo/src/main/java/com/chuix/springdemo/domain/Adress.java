package com.chuix.springdemo.domain;

public class Adress {
	
	private String street;
	private String city;
	private String zipCode;
	
	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Adress [street=" + street + ", city=" + city + ", zipCode=" + zipCode + "]";
	}
}
