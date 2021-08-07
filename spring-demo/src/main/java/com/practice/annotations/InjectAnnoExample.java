package com.practice.annotations;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class InjectAnnoExample {

	@Inject // Java based dependency
	AwExampleDep awExampleDep;

	public InjectAnnoExample(AwExampleDep awExampleDep) {
		System.out.println("Inject class annotation");
	}

	public AwExampleDep getAwExampleDep() {
		return awExampleDep;
	}

	public void setAwExampleDep(AwExampleDep awExampleDep) {
		this.awExampleDep = awExampleDep;
	}

}
