package com.techment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techment.entity.Book;
import java.lang.String;
import java.util.List;

@Repository
public interface IBookDao extends JpaRepository<Book, Integer> {
	
	List<Book> findByAuthorName(String name);
	List<Book> findByPriceBetween(int a,int b);

}
