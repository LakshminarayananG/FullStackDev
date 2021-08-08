package com.practice.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("./opendoor.xml");
			// OpenDoor openDoor = appContext.getBean(OpenDoor.class);
			OpenDoor openDoor = (OpenDoor) appContext.getBean("opendoorimpl");
			System.out.println(openDoor.getClass().getName());
			// openDoor.openDoorWithKey(100);
			// openDoor.openDoorWithPassword();
			// openDoor.throwErr();
			openDoor.openDoorWithReturn();
			appContext.close();

			ClassPathXmlApplicationContext closeContext = new ClassPathXmlApplicationContext("./closedoor.xml");
			CloseDoor closeDoor = (CloseDoor) closeContext.getBean("closedoorimpl");
			System.out.println(closeDoor.getClass().getName());
			closeDoor.closeDoorWithName("Door Close");
			closeDoor.closeDoorWithPwd("sample password");
			closeDoor.closeDoorWithReturn();

			closeContext.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
