package com.techment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.ICustomerDao;
import com.techment.dto.CustomerDto;
import com.techment.entity.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	ICustomerDao dao;

	@Override
	public String addCustomer(CustomerDto customerDto) {
		Customer customer = new Customer();
		customer.setName(customerDto.getName());
		customer.setAge(customerDto.getAge());
		customer.setAddress(customer.getAddress());
		customer.setEmail(customer.getEmail());
		dao.save(customer);
		return "Customer is added.....";
		
	}

	@Override
	public List<CustomerDto> viewAllCustomer() {
		
		List<Customer> customer =dao.findAll();
		List<CustomerDto> customerDto = new ArrayList<CustomerDto>();
		
		for(Customer c: customer)
		{
			customerDto.add(new CustomerDto(c.getId(), c.getName(),c.getAge()));
		}
		return customerDto;
	}

	@Override
	public CustomerDto viewCustomerById(int id) throws NoSuchElementException{
		
		Customer customer=dao.findById(id).get();
		CustomerDto customerDto=new CustomerDto(customer.getId(),customer.getName(),customer.getAge());
		
		
		return customerDto;
				
	}

	@Override
	public void deleteCustomer(int id) throws NoSuchElementException{
		
		dao.findById(id).get();
		dao.deleteById(id);
		
	}

	@Override
	public CustomerDto updateCustomer(CustomerDto customerDto, int id) throws NoSuchElementException {
		// we need to check whether employee with given id is exist in DB or not
				Customer customer = dao.findById(id).get(); 
				
				customer.setName(customerDto.getName());
				customer.setAge(customerDto.getAge());
				customer.setMobile(customerDto.getMobile());
				customer.setAddress(customerDto.getAddress());
				customer.setEmail(customerDto.getEmail());
				
				// save existing employee to DB
				dao.save(customer);
				return customerDto;
	}
}