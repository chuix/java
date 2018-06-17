package com.chuix.springdemo.domain.product;

import java.util.Random;

public class ConsumerProduct extends GenericProduct {

	@Override
	public int calcularPrice() {
		Random random = new Random();
		int price = random.nextInt(priceRandomizer);
		return price;
	}

}
