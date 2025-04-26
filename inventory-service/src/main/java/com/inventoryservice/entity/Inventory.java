package com.inventoryservice.entity;

import jakarta.persistence.Entity;

@Entity
public class Inventory {

	@jakarta.persistence.Id
	private Long Id;
	
	private String name;
	
	private Integer quantity;
	
}
