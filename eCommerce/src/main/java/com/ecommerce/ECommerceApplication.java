package com.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ecommerce.entity.Category;
import com.ecommerce.entity.Products;
import com.ecommerce.repositaries.CategoryRepositary;


@SpringBootApplication 
public class ECommerceApplication  implements CommandLineRunner{

	@Autowired
	private CategoryRepositary categoryRepositary;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Category category =new Category("Electronics");
		
		Products products1= new Products("Mobile","20000.00");
		
		
		category.getProducts().add(products1);
	}

}
