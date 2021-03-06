package com.ecommerce.services;

import java.util.List;

import com.ecommerce.entity.Category;
import com.ecommerce.entity.Products;

public interface IProductService {
	

	public List<Products> findAllProducts();
	
	public List<Products> getProductsByCategory();
	
	public Products getProductById(int id)throws Exception;

	public String saveProduct(Products products);
}
