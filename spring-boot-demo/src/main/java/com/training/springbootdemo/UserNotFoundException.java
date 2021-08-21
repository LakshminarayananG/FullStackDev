package com.training.springbootdemo;

public class UserNotFoundException extends Exception{
	
	public UserNotFoundException(String message) {
		System.out.println(message);
	}

}
