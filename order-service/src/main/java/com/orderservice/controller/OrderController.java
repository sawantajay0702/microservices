package com.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.orderservice.entity.Order;
import com.orderservice.service.OrderService;

@RestController
@RequestMapping("/api")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/place-order")
	@ResponseStatus(code=HttpStatus.CREATED)
	public String placeOrder(@RequestBody Order order) {
		orderService.placeOrder(order);
		return "Order Placed Successfully";
		
	}
	
}
