package com.techment.modal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//<bean id="employee" class="com.techment.modal.Employee"></beam>
public class Employee {

	@Autowired
	Address address;
	
	public void employeeDetails() {
		address.AddressDetails();
	}
	
}
