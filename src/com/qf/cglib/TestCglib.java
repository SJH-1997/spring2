package com.qf.cglib;

import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;

public class TestCglib {
	
	@Test
	public void test() {
		//创建目标对象
		Teacher tea = new Teacher();
		
		//创建代理对象
		MyCglibProxy proxy = new MyCglibProxy(tea);
		//cglib核心类
		Enhancer enhancer = new Enhancer();
		//将目标对象设置为父类，这也是跟jdk动态代理的区别
		enhancer.setSuperclass(tea.getClass());
		//执行回调
		enhancer.setCallback(proxy);
		//生成具体的代理对象
		Teacher t = (Teacher)enhancer.create();
		//通过代理对象执行业务方法
		t.say();
	}
}
