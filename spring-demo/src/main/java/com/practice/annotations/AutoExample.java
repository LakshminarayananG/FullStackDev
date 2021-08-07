package com.practice.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutoExample {

	@Autowired // Spring based dependency
	AwExampleDep awExampleDep;

	public AutoExample() {
		System.out.println("Example class constructor");
	}

	public AwExampleDep getAwExampleDep() {
		return awExampleDep;
	}

	public void setAwExampleDep(AwExampleDep awExampleDep) {
		this.awExampleDep = awExampleDep;
	}

}
