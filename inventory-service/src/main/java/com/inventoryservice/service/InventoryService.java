package com.inventoryservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventoryservice.entity.Inventory;
import com.inventoryservice.repository.InvetoryRepository;

@Service
public class InventoryService {

	@Autowired
	private InvetoryRepository invetoryRepository;
	
	public boolean isProductInStock(String name,Integer quantity) {
		Optional<Inventory> inventory= invetoryRepository.findByNameAndQuantityIsGreaterThanEqual(name, quantity);
		if(inventory.isPresent()) {
			return true;
		}else {
			return false;
		}
		}
}
