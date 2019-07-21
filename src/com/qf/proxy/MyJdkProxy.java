package com.qf.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//��������Ҫʵ��InvocationHandler	
public class MyJdkProxy implements InvocationHandler{
	
	//Ŀ����󣬱�����Ķ���
	private Object object;
	
	public MyJdkProxy(Object object) {
		this.object = object;
	}
	
	
	//����ִ�еķ���
	/*
	 * proxy������Ķ���
	 * method:Ŀ�������Ҫִ�еķ�����
	 * args:Ŀ�����ִ�з�����Ҫ�Ĳ���*/
	public Object invoke(Object proxy, Method method, Object[] args)throws Throwable {
		System.out.println("����ķ���ִ���ˣ�����");
		
		//����Ŀ��������ҵ�񷽷�
		Object ret = method.invoke(object, args);
		return ret;
	}
	        
}
