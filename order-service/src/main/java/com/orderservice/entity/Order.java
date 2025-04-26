package com.orderservice.entity;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="order_details")
public class Order {

	@Column(name="order_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Items> itemsList;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public List<Items> getItemsList() {
		return itemsList;
	}

	public void setItemsList(List<Items> itemsList) {
		this.itemsList = itemsList;
	}

	

	public Order(Long id, Integer quantity, List<Items> itemsList, BigDecimal totalPrice) {
		super();
		this.id = id;
		
		this.itemsList = itemsList;
	}

	public Order() {
		super();
	}
	
	
	
}
