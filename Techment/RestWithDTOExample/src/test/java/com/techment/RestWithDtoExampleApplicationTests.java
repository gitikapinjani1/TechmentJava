package com.techment;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.techment.dao.ICustomerDao;
import com.techment.service.CustomerServiceImpl;
@RunWith(SpringRunner.class)
@SpringBootTest
class RestWithDtoExampleApplicationTests {

	
	private CustomerServiceImpl customerServiceImpl;
	private ICustomerDao iCustomerDao;
	@Test
	void contextLoads() {
		
	}
}
