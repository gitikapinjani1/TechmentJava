package com.techment.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techment.service.DatabaseService;

public class ClientApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.techment");
		context.refresh();
		
		DatabaseService dbService=(DatabaseService) context.getBean("databaseService");
		dbService.displayDatabaseInfo();
		
		
	}

}