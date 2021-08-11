package com.Techment.day6.exception;

public class InSufficientFundException extends RuntimeException {

	String msg;

	public InSufficientFundException(String msg) {
		super();
		this.msg = msg;
	}

}

