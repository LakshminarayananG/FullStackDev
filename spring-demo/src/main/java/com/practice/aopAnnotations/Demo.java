package com.practice.aopAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.practice.aopAnnotations")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Demo {

	public static void main(String[] args) {
		try {
			AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(Demo.class);
			OpenDoor openDoor = (OpenDoor) appContext.getBean("openDoorImpl");
			System.out.println(openDoor.getClass().getName());
			openDoor.openDoorWithKey(100);
			appContext.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
