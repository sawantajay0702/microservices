package com.productservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.productservice.dto.ProductRequest;
import com.productservice.entity.Product;
import com.productservice.service.ProductService;

import jakarta.validation.Valid;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/api")
@Log4j
public class ProductController {
	
	@Autowired
	private ProductService productService; 
	
	private final Logger logger=LoggerFactory.getLogger(ProductController.class);
	
	@PostMapping("/save-product")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void createProduct(@Valid @RequestBody ProductRequest productRequest) {
		logger.info("Inside product save controller");
		productService.saveProduct(productRequest);
	}
	
	@GetMapping("/get-products")
	
	public List<Product> getProducts(){
		return productService.getAllProducts();
	}
	

}
