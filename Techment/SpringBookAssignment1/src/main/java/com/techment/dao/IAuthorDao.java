package com.techment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techment.entity.Author;

@Repository
public interface IAuthorDao extends JpaRepository<Author, Integer> {

	//List<Product> findByName(String name);
}
