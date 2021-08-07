package com.practice.annotations;

import javax.inject.Named;

@Named("namedanno")
public class NamedAnnotationEg {

	@Override
	public String toString() {
		return "NamedAnnotationEg [getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

	public NamedAnnotationEg() {
		System.out.print("Named class annotation");
	}

}
