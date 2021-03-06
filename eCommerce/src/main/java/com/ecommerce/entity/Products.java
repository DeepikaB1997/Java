package com.ecommerce.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity(name= "products")
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "product_name", nullable = false)
	private String productName;
	private String price;
	
//	@JsonFormat(pattern="MM/dd/yyyy")
//	@Column(name ="added_on")
//	private LocalDate addedOn;
	
	
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn(name ="category_id",referencedColumnName = "id", nullable = false)
	private Category category;

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Products( String productName, String price) {
		super();

		this.productName = productName;
		this.price = price;
		//this.addedOn = addedOn;
		
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

//	public LocalDate getAddedOn() {
//		return addedOn;
//	}
//
//	public void setAddedOn(LocalDate addedOn) {
//		this.addedOn = addedOn;
//	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}



	@Override
	public String toString() {
		return "Products [id=" + id + ", productName=" + productName + ", price=" + price + ", category=" + category
				+ "]";
	}




	
	
	
	
	
	

}
