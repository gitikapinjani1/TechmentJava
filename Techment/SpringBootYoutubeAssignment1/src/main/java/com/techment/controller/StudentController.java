package com.techment.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/getStudentDetails")
	public Student getStudent() {
		return new Student("Gitika","Pinjani");
	}
	
	@GetMapping("/getStudentDetailsInList")
	public List<Student> getStudents()
	{
		
		List<Student> students=new ArrayList<Student>();
		students.add(new Student("Gitika" , "Pinjani"));
		students.add(new Student("Katyani" , "Sahu"));
		students.add(new Student("Divya" , "Agrawal"));
		students.add(new Student("Rajshri" , "Dewangan"));
		
		return students;
		
	}
	
	@GetMapping("/student{firstName}/{lastName}")
	public Student getStudentLastName(@PathVariable String firstName,@PathVariable String lastName)
	{
		
		return new Student(firstName, lastName);
	}
	
	
	@GetMapping("/StudentQueryParameter")
	public Student studentQueryParameter(@RequestParam String firstName,@RequestParam String lastName)
	{
		return new Student(firstName, lastName);
	}
	
	
	
}
