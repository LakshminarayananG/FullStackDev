package com.practice.aop;

public class CloseDoorImpl implements CloseDoor {

	public String closeDoorWithName(String name) {
		System.out.println("Close Door with corresponding name  " + name);
		return name;
	}

	public String closeDoorWithPwd(String pwd) {
		System.out.println("Close Door with corresponding password  " + pwd);
		return pwd;
	}

	public void throwErr() throws Exception {
		System.out.println("This will throw error");
		int[] arr = { 0, 1 };
		System.out.println(arr[2]);
	}

	public int closeDoorWithReturn() {
		System.out.println("Close door with return Key");
		return 1289;
	}

}
