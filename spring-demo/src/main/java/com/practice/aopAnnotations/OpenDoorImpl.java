package com.practice.aopAnnotations;

import org.springframework.stereotype.Component;

@Component
public class OpenDoorImpl implements OpenDoor {

	public OpenDoorImpl() {

	}

	public int openDoorWithKey(int num) {
		System.out.println("Opening the Door ....");
		return 2;
	}

}
