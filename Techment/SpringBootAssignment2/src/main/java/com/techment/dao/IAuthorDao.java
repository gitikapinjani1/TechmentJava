package com.techment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techment.entity.Author;

@Repository
public interface IAuthorDao extends JpaRepository<Author, Integer> {

	String findByBooksISBN(int ISBN);
//	List<Product> findByName(String name);
//	List<Product> findByCategory(String category);
//	List<Product> findByCategoryAndName(String category , String name);
	
}
