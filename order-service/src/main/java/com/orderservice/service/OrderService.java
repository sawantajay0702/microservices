package com.orderservice.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.orderservice.entity.Items;
import com.orderservice.entity.Order;
import com.orderservice.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
//	@Autowired
//	private RestTemplate restTemplate;
	
	
	public void placeOrder(Order order) throws Exception {
		 String unventoryUrl="http://localhost:8081/api/inventory-service/{name}/{quantity}";
		 
		 List<Items> itemsList = order.getItemsList();
		 boolean isStockAvailbale=true;
		 
		 for(Items item:itemsList) {
			 Map<String, Object> requestMap=new HashMap<>();
			 requestMap.put("name", item.getName());
			 requestMap.put("quantity", item.getQuantity());
			 ResponseEntity<Object> inventoryResponse = new RestTemplate().getForEntity(unventoryUrl, Object.class, requestMap);
			 inventoryResponse.getBody();
			 if(inventoryResponse.getBody().equals(false)) {
				 isStockAvailbale=false;
				 break;
			 }
			 System.out.println( inventoryResponse.getBody());
		 }
		if(isStockAvailbale) {
		orderRepository.save(order);
		}else {
			throw new Exception("Stock Not Available");
		}
	}
	
}
