package com.techment.exception;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(value=IdNotFoundException.class)
	public ResponseEntity<Object> myException(IdNotFoundException exception)
	{
		return new ResponseEntity<Object>(exception.getMsg(), HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(value=EmployeeException.class)
	public ResponseEntity<String> myEmployeeException(EmployeeException exception)
	{
		
		return new ResponseEntity<String>(exception.getMsg(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value=ValidationException.class)
	public ResponseEntity<List<String>> myValidationException(ValidationException exception)
	{
		return new ResponseEntity<List<String>>(exception.getMessages(), HttpStatus.BAD_REQUEST);
	}
}
