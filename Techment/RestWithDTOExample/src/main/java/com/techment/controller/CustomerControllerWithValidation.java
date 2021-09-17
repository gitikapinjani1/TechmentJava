package com.techment.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.ValidationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.CustomerDto;
import com.techment.service.ICustomerService;

@RestController
@RequestMapping(value ="/customerValidationController")
public class CustomerControllerWithValidation {

	ICustomerService customerService;
	
	@PostMapping(value="addNewCustomer")
	public ResponseEntity<String> addNewCustomer(@Valid @RequestBody CustomerDto customerDto, BindingResult bindingResult) throws MethodArgumentNotValidException
	{

		if(bindingResult.hasErrors())
		{
			System.out.println("has Error....");
			
		}
		
		customerService.addCustomer(customerDto);
		return new ResponseEntity<String>("added new customer", HttpStatus.OK);
	}
	
}
