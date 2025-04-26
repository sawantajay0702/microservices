package com.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productservice.dto.ProductRequest;
import com.productservice.entity.Product;
import com.productservice.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public void saveProduct(ProductRequest productRequest) {
		Product product=new Product();
		product.setDescription(productRequest.getDescription());
		product.setName(productRequest.getName());
		product.setPrice(productRequest.getPrice());
		
		productRepository.save(product);
		
		
	
	}

	public List<Product> getAllProducts() {
		return productRepository.findAll();
		
	}
	
}
