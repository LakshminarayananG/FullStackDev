package com.practice.aopAnnotations;

import org.springframework.stereotype.Component;

@Component
public class CloseDoorImpl implements CloseDoor {

	public String closeDoorWithName(String Name) {
		System.out.println("Close door implementation with " + Name);
		return Name;

	}

}
