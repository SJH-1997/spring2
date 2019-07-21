package com.qf.controller;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestController {
	
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/qf/pojo/applicationContext.xml");
		PersonController controller = (PersonController)context.getBean("personController");
		controller.show();
	}
}
