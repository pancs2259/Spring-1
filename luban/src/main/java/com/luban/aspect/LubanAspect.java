package com.luban.aspect;

import org.aspectj.lang.annotation.Before;

//@Aspect
//@Component
public class LubanAspect {

	@Before("execution(public void com.luban.service.AService.test())")
	public void lubanBefore() {
		System.out.println("aop功能");
	}


}
