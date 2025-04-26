package com.orderservice.service;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.orderservice.dto.ItemRequest;
import com.orderservice.entity.Items;
import com.orderservice.repository.ItemRepository;

@Service
public class ItemService {

     @Autowired
	private ItemRepository itemRepository;
	
	public void saveItem(ItemRequest itemRequest) {
		Items item=new Items();
		item.setName(itemRequest.getName());
		item.setPrice(itemRequest.getPrice());
		
		itemRepository.save(item);
		
	}
	
}
