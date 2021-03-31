package com.ecommerce.services;

import java.util.List;

import com.ecommerce.entity.Category;

public interface ICategoryService {
	public List<Category> findAllCategories();

	public String saveCategory(Category category);

}
