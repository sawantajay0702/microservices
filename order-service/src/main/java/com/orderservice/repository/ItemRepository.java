package com.orderservice.repository;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orderservice.entity.Items;

@Repository
public interface ItemRepository extends JpaRepository<Items, Long>{
  
	
}
