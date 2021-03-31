package com.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.Products;
import com.ecommerce.repositaries.ProductRepositary;

@Service
public class ProductService  implements IProductService{
	
	@Autowired
	private ProductRepositary productRepositary;
	
	

	

	@Override
	public List<Products> findAllProducts() {
		// find all products 
		return productRepositary.findAll();
	}

	@Override
	public List<Products> getProductsByCategory() {
		// get product list by category
		return null;
	}

	@Override
	public Products getProductById(int id) throws Exception {
		// get product By id
		return productRepositary.findById(id).orElseThrow(() ->new Exception("Product is not found"));
	}

	@Override
	public String saveProduct(Products products) {
		productRepositary.save(products);
		return "Product added successfully";
	}
	
	

}
