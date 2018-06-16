package com.chuix.springdemo.domain;

public class Adress {
	
	private String street;
	private String city;
	private String zipCode;
	
	public Adress(String street, String city, String zipCode) {
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Adress [street=" + street + ", city=" + city + ", zipCode=" + zipCode + "]";
	}
}
