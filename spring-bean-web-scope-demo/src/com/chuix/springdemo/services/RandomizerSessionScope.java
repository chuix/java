package com.chuix.springdemo.services;

public class RandomizerSessionScope {

	private int randomNumber = 10;
	
	public int getRandomNumber(){
		return randomNumber;
	}
	
	public void generateRandomNumber() {
		this.randomNumber = (int) (Math.random() * 9999);
	}
}
