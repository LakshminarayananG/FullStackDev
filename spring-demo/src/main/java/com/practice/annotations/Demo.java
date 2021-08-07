package com.practice.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("annotation.xml");
		Example eg = ctx.getBean(Example.class);
		System.out.println(eg);

		NamedAnnotationEg nae = ctx.getBean(NamedAnnotationEg.class);

		// The below would also access the bean created with default class name.
		// If the value is specified in the named annotation, corresponding name should
		// be specified
		/*
		 * NamedAnnotationEg ne = ctx.getBean("namedannotationeg",
		 * NamedAnnotationEg.class);
		 */

		System.out.println(nae);

		// Autowired dependency
		AutoExample ae = ctx.getBean(AutoExample.class);
		System.out.println(ae.getAwExampleDep());

		// Inject Dependency
		InjectAnnoExample iae = ctx.getBean(InjectAnnoExample.class);
		System.out.println(iae.getAwExampleDep());

		// Service ANnotation
		ServiceExample se = ctx.getBean(ServiceExample.class);
		se.servicename = "Lakshmi";
		System.out.println(se.getServicename());

		// Service ANnotation
		RepositoryExample re = ctx.getBean(RepositoryExample.class);
		System.out.println(re);

		// Controller Annotation
		ControllerExample ce = ctx.getBean(ControllerExample.class);
		System.out.println(ce);

		ctx.close();

	}

}
