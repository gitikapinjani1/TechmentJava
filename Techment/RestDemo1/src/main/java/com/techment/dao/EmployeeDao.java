package com.techment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
