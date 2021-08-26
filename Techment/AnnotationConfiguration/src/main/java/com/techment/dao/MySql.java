package com.techment.dao;

import org.springframework.stereotype.Repository;

@Repository

public class MySql implements IDao {
	
	public void databaseName() {
		System.out.println("connected to mysql database");
	}

}
