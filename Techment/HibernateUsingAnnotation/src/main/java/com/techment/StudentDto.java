package com.techment;

public class StudentDto {
	
	int id;
	String name;
	String dept;
	
	public StudentDto() {
		super();
	}

	public StudentDto(int id) {
		super();
		this.id = id;
	}

	public StudentDto(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	

}
