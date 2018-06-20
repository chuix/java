package com.chuix.springdemo.domain.promotion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chuix.springdemo.domain.product.ConsumerProduct;
import com.chuix.springdemo.domain.product.IndustrialProduct;


@Component("myfair")
public class TradeFair {
	
	private IndustrialProduct industrialProduct;
	private ConsumerProduct consumerProduct;

	public TradeFair() {
		
	}
	
	@Autowired
	public TradeFair(IndustrialProduct industrialProduct, ConsumerProduct consumerProduct) {
		super();
		this.industrialProduct = industrialProduct;
		this.consumerProduct = consumerProduct;
	}

	public int declareIndustrialProductPrice(IndustrialProduct industrialProduct) {
		return industrialProduct.calcularPrice();
		
	}
	
	public int declareConsumerProductPrice(ConsumerProduct consumerProduct) {
		return consumerProduct.calcularPrice();
		
	}

	public String specialPromotionalPricing() {
		String priceInfo = "Industrial Product is priced at $" + declareIndustrialProductPrice(industrialProduct) + " and " +
							"Consumer Product is priced at $" + declareConsumerProductPrice(consumerProduct);
		return priceInfo;
	}

/*
	@Autowired
	public void setIndustrialProduct(IndustrialProduct industrialProduct) {
		this.industrialProduct = industrialProduct;
	}

	@Autowired
	public void setConsumerProduct(ConsumerProduct consumerProduct) {
		this.consumerProduct = consumerProduct;
	}
*/
	
}
