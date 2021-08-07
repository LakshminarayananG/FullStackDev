package com.practice.annotations;

import org.springframework.stereotype.Component;

@Component("exam") // Default bean with classname as bean name. In this case bean name would be
					// example

//Can also name by passing it along with the annotation
public class Example {

	public Example() {
		System.out.println("Constructor from example class");
	}

	@Override
	public String toString() {
		return "Example [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
