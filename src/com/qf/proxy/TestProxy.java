package com.qf.proxy;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class TestProxy {
	
	@Test
	public void test() {
		//创建目标对象
		IAnimal person = new Person();
		
		//创建代理对象
		MyJdkProxy jdkProxy = new MyJdkProxy(person);
		//person.getClass().getClassLoader()目标对象字节码加载对象
		///person.getClass().getInterfaces(), jdkProxy目标对象实现的接口
		IAnimal a = (IAnimal)Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), jdkProxy);
		
		//通过代理对象执行业务方法
		a.say();
		
	}
}
