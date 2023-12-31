package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	public Object around_log(ProceedingJoinPoint _pjp) throws Throwable {
		
		System.out.println("[before]");
		// before
		Object obj = _pjp.proceed();
		// after
		System.out.println("[after]");
		
		return obj;
	}
}
