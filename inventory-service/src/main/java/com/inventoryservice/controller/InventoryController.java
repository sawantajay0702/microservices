package com.inventoryservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventoryservice.service.InventoryService;

@RestController
@RequestMapping("/api")
public class InventoryController {
	
	@Autowired
	private InventoryService inventoryService;
	
	@GetMapping("/inventory-service/{name}/{quantity}")
	public Boolean isProductInStock(@PathVariable String name,@PathVariable Integer quantity) {
		return inventoryService.isProductInStock(name, quantity);
	}

}
