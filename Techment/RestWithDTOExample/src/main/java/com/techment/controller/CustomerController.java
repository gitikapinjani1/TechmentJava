package com.techment.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.CustomerDto;
import com.techment.exception.IdNotFoundException;
import com.techment.exception.ValidationException;
import com.techment.service.ICustomerService;

@RestController
@RequestMapping("/CustomerController")
public class CustomerController {
	
	@Autowired
	ICustomerService service;
	
	@GetMapping("/viewAllCustomer")
	public List<CustomerDto> viewCustomer(@RequestHeader String token){
		return service.viewAllCustomer();
	}
	@PostMapping("/InsertCustomer")
	public String addNewCustomer(@Valid @RequestBody CustomerDto customerDto, BindingResult bindingResult) throws MethodArgumentNotValidException
	{
		
		if(bindingResult.hasErrors())
		{
			List<FieldError> fieldError= bindingResult.getFieldErrors();
			List<String> errorList = new ArrayList<String>();
			for(FieldError f:fieldError)
			{
				errorList.add(f.getDefaultMessage());
			}
			throw new ValidationException(errorList);
		}
		service.addCustomer(customerDto);
		return "Insertion done";
	}
	
	@GetMapping("/viewCustomerById/{id}")
	public CustomerDto getById(@PathVariable int id)
	{
		try {
		CustomerDto customerDto = service.viewCustomerById(id);
	return customerDto;
		}
		catch(NoSuchElementException e)
		{
			throw new IdNotFoundException(" No Id present with the given value of id");
		}
	}
	@DeleteMapping("/deleteCustomerByid/{id}")
public ResponseEntity<String> deleteCustomer(@PathVariable("id") int id){
		
		
		try {
			// delete employee from DB
			service.deleteCustomer(id);
		return new ResponseEntity<String>("Employee deleted successfully!.", HttpStatus.OK);
		}
		catch (NoSuchElementException e)
		{
			throw new IdNotFoundException("No id present to Delete it");
		}
		 
	}
	
	
	@PutMapping("/UpdateCustomer/{id}")
	public ResponseEntity<CustomerDto> updateCustomer(@PathVariable("id") int id
												  ,@RequestBody CustomerDto customerDto){
		try {
		return new ResponseEntity<CustomerDto>(service.updateCustomer(customerDto,id), HttpStatus.OK);
		}
		catch (NoSuchElementException e)
		{
			throw new IdNotFoundException("No id present to Update it");
		}
		
		}
	
	
	
	
	
	
	@ExceptionHandler(value=IdNotFoundException.class)
	public ResponseEntity<Object> myException(IdNotFoundException exception)
	{
		return new ResponseEntity<Object>(exception.getMsg(), HttpStatus.NOT_FOUND);
	}
	
}
