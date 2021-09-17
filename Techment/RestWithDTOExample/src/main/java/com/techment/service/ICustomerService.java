package com.techment.service;

import java.util.List;

import com.techment.dto.CustomerDto;

public interface ICustomerService {
	String addCustomer(CustomerDto customerDto);
	List<CustomerDto> viewAllCustomer();
	CustomerDto viewCustomerById(int id);
	void deleteCustomer(int id);
	CustomerDto updateCustomer(CustomerDto customerDto, int id);

}