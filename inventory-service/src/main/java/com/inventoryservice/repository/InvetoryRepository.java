package com.inventoryservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventoryservice.entity.Inventory;

@Repository
public interface InvetoryRepository extends JpaRepository<Inventory, Long> {
	
	Optional<Inventory> findByNameAndQuantityIsGreaterThanEqual(String name,Integer quantity);

}
