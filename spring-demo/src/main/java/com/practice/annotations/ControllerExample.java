package com.practice.annotations;

import org.springframework.stereotype.Controller;

@Controller
public class ControllerExample {

	String controller;

	public ControllerExample() {
		System.out.println("Controller class example");
	}

	public String getController() {
		return controller;
	}

	public void setController(String controller) {
		this.controller = controller;
	}

}
