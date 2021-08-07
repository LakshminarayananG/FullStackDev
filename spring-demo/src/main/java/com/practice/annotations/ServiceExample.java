package com.practice.annotations;

import org.springframework.stereotype.Service;

@Service
public class ServiceExample {

	String servicename;

	public String getServicename() {
		return servicename;
	}

	public void setServicename(String servicename) {
		this.servicename = servicename;
	}

	public ServiceExample() {
		System.out.println("Service class constructor");
	}

}
