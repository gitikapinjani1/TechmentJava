package com.techment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techment.dao.IAuthorDao;
import com.techment.entity.Author;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SpringBookAssignment1Application implements CommandLineRunner {

	@Autowired
	IAuthorDao iAuthorDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBookAssignment1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("This is my first Spring Boot");
	
Author author = new Author();
		
		author.setAuthorId(10);
		author.setFirstName("Gitika");
		author.setMiddleName(" ");
		author.setLastName("Pinjani");
		author.setPhoneNo(98989898);
		
		iAuthorDao.save(author);
		
		System.out.println("inserted..................");
		
		iAuthorDao.deleteById(1);
		

		
		
	}

}
