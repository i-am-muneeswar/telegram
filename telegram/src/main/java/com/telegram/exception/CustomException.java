package com.telegram.exception;

public class CustomException extends Exception{
	
	public String toString() {
		return "Cannot create profile with the company name";
	}

}
