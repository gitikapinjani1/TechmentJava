package com.techment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techment.dao.IProductDao;
import com.techment.entity.Product;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SpringBootJpaApplication implements CommandLineRunner {

	@Autowired
	IProductDao iProductDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("This is my first Spring Boot");
		
		Product product1=new Product("Laptop", "Eletronic", 50000);
		Product product2=new Product("TV", "Eletronic", 30000);

		
//		iProductDao.save(product1);
//		iProductDao.save(product2);
		
		System.out.println("inserted..................");
		
		List<Product> products=iProductDao.findAll();
		products.forEach(System.out::println);
		
		Optional<Product> p=iProductDao.findById(54);
		
		if(p.isPresent())
			System.out.println("Product "+p.get());
		else
			System.out.println("No product");
		
		Product product3=new Product();
		System.out.println("Product "+product3);
		
		//count
		
		Long totalProducts= iProductDao.count();
		System.out.println("total no. of products " +totalProducts);
		
		//delete
//		iProductDao.deleteById(3);
//		System.out.println("deleted........");
		
		List<Product> prod=iProductDao.findByName("Laptop");
		System.out.println("PRODUCT " +prod);
		
		List<Product> prodList=iProductDao.findByCategory("Eletronic");
		System.out.println(prodList);
		
		
		
			
		
		
		
		
		
	}

}
