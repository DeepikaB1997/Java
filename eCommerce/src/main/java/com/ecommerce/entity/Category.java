package com.ecommerce.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name ="category")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "category_name", nullable = false)
	private String categoryName;
	

	@OneToMany(mappedBy="category",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Products> products;

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Category( String categoryName) {
		super();
		
		this.categoryName = categoryName;
		
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}




	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}


	@Override
	public String toString() {
		return "Category [id=" + id + ", categoryName=" + categoryName + ", products=" + products + "]";
	}

	

	
}
