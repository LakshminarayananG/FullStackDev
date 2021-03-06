package com.practice.aopAnnotations;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class KeyAspect {

	public KeyAspect() {

	}

	@Before("execution(* com.practice.aopAnnotations.OpenDoor.openDoorWithKey(..))")
	public void insertKey(JoinPoint joinpoint) {
		System.out.println("Insert Key " + joinpoint.getArgs()[0]);
	}

	@After("execution(* com.practice.aopAnnotations.OpenDoor.openDoorWithKey(..))")
	public void removeKey() {
		System.out.println("Remove Key");
	}

	public void insertKeyBeforeClose(JoinPoint joinpoint) {
		System.out.println("Insert key before close dooe " + joinpoint.getArgs()[0]);
	}

	public void removeKeyAfterCloseDoor(JoinPoint joinpoint) {
		System.out.println("Remove key after close dooe " + joinpoint.getArgs()[0]);
	}
}
