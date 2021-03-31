package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.Products;
import com.ecommerce.services.ICategoryService;
import com.ecommerce.services.IProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	@GetMapping("/list")
	public List<Products> getAllProducts(){
		return productService.findAllProducts();
	}
	
	@PostMapping("/addProduct")
	public String addProducts(@RequestBody Products products) {
		return productService.saveProduct(products);
		
	}
	
	
	

}
