package com.practice.aop;

public interface CloseDoor {

	public String closeDoorWithName(String name);

	public String closeDoorWithPwd(String name);

	public void throwErr() throws Exception;

	public int closeDoorWithReturn();

}
