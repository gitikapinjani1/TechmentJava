package com.techment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techment.dao.IAuthorDao;
import com.techment.dao.IBookDao;
import com.techment.entity.Author;
import com.techment.entity.Book;
@SpringBootApplication
public class SpringBookAssignmentApplication implements CommandLineRunner {

	@Autowired
	IAuthorDao iAuthorDao;
	@Autowired
	IBookDao iBookDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBookAssignmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Author author1=new Author();
		Author author2=new Author();
		
		author1.setName("Gitika");
		author2.setName("Sam");
		
		Book b1=new Book("Java",500,author1);
		Book b2 =new Book("Python",600,author1);
		Book b3 =new Book("Core Java",700,author2);
		Book b4 =new Book("cpp",800,author2);
		
//		iAuthorDao.save(author1);
//		iAuthorDao.save(author2);
//		iBookDao.save(b1);
//		iBookDao.save(b2);
//		iBookDao.save(b3);
//		iBookDao.save(b4);
		
		List<Book> book1=new ArrayList<Book>();
		List<Book> book2=new ArrayList<Book>();
		book1.add(b1);
		book1.add(b2);
		book2.add(b3);
		book2.add(b4);
		
		System.out.println("inserted..................");
		
		
		List<Book> a=iBookDao.findAll();
		a.forEach(System.out::println);
		
		List<Book> b=iBookDao.findByAuthorName("Gitika");
		b.forEach(System.out::println);
		
		List<Book> c=iBookDao.findByPriceBetween(600, 800);
		c.forEach(System.out::println);
		
		Optional<Author> authorName = iAuthorDao.findById(2);
		System.out.println("Author is "+authorName.get().getName());
		
		System.out.println("==============Completed===============");
		
		
		
//		List<Product> products=iProductDao.findAll();
//		products.forEach(System.out::println);
//		List<Product> products=iProductDao.findAll();
//		products.forEach(System.out::println);
//		
//		Optional<Product> p=iProductDao.findById(54);
//		
//		if(p.isPresent())
//			System.out.println("Product "+p.get());
//		else
//			System.out.println("No product");
//		
//		Product product3=new Product();
//		System.out.println("Product "+product3);
//		
//		//count
//		
//		Long totalProducts= iProductDao.count();
//		System.out.println("total no. of products " +totalProducts);
//		
//		//delete
////		iProductDao.deleteById(3);
////		System.out.println("deleted........");
//		
//		List<Product> prod=iProductDao.findByName("Laptop");
//		System.out.println("PRODUCT " +prod);
//		
//		List<Product> prodList=iProductDao.findByCategory("Eletronic");
//		System.out.println(prodList);
		
	}

}
