package com.orderservice.dto;

import java.math.BigDecimal;

public class ItemRequest {
	
    private String name;
	
	private BigDecimal price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public ItemRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ItemRequest(String name, BigDecimal price) {
		super();
		this.name = name;
		this.price = price;
	}
	
		
	


}
