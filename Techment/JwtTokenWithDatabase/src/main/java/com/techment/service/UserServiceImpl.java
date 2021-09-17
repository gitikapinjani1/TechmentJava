package com.techment.service;


import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.Entiry.User;
import com.techment.Repository.UserRepository;
import com.techment.dto.UserDto;
import com.techment.util.SiteUtil;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	SiteUtil siteUtil;

	@Override
	public UserDto login(String username, String password) throws NoSuchElementException {
	User user =userRepository.findByUserNameAndPassword(username, password).get();
	
	String token = siteUtil.generateToken();
	user.setToken(token);
	
	userRepository.save(user);
	UserDto userDto = new UserDto(user.getUserName(), user.getPassword(),token);
		return userDto;
	}
}