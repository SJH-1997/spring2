package com.qf.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTeacher {
	
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/qf/pojo/applicationContext.xml");
		Teacher teacher = (Teacher)context.getBean("teacher");
		System.out.println(teacher.toString());
		
	}

}
