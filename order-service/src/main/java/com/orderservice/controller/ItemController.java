package com.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.orderservice.dto.ItemRequest;
import com.orderservice.service.ItemService;

@RestController
@RequestMapping("/api")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@PostMapping("/save-item")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void saveItem(@RequestBody ItemRequest itemRequest) {
		itemService.saveItem(itemRequest);
	}
	
}
