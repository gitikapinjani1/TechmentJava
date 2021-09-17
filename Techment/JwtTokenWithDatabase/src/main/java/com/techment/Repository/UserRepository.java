package com.techment.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.Entiry.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	Optional<User> findByUserNameAndPassword(String userName , String password);
}
