package com.techment.exception;

public class EmployeeException  extends RuntimeException{
	
	
	String msg;
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
}

	public EmployeeException(String msg) {
		super();
		this.msg = msg;
	}
}
