package com.chuix.springdemo.domain.product;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class IndustrialProduct extends GenericProduct {

	@Override
	public int calcularPrice() {
		Random random = new Random();
		int price = random.nextInt(priceRandomizer);
		return price;
	}

}
