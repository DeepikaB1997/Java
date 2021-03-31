package com.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.Category;
import com.ecommerce.repositaries.CategoryRepositary;

@Service
public class CategoryService implements ICategoryService{
	
	@Autowired
	private CategoryRepositary categoryRepositary;
	
	
	@Override
	public List<Category> findAllCategories() {
		// find all categories 
		return categoryRepositary.findAll();
	}


	@Override
	public String saveCategory(Category category) {
		// TODO Auto-generated method stub
		 categoryRepositary.save(category);
		return "Category added successfully";
	}

}
