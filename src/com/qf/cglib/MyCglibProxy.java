package com.qf.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class MyCglibProxy implements MethodInterceptor{
	
	//Ŀ�����
	private Object ob;
	
	
	public MyCglibProxy(Object ob) {
		this.ob = ob;
	}


	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("��ɽ!");
		
		//Ŀ������ҵ�񷽷�,��һ�������������Ŀ����󣬵ڶ�������������Ŀ����󷽷��Ĳ���
		Object obj = methodProxy.invoke(ob, args);
		return obj;
	}
	
}
