package com.techment;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techment.entity.User;
import com.techment.repository.UserRepository;

@SpringBootApplication
public class SpringSecurityJwtEampleApplication {
	@Autowired
	private UserRepository userRepository;
	
	@PostConstruct
	public void initUser() {
		
		List<User> users=new ArrayList<User>();
		User user1=new User(1,"gitika","root1","gitika@gmail.com");
		User user2= new User(1,"Katyani","root2", "katyani@gmail.com");
		users.add(user1);
		users.add(user2);
		
		userRepository.save(user1);
		userRepository.save(user2);
	}
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtEampleApplication.class, args);
	}

}
