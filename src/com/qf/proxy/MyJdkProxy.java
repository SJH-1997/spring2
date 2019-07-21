package com.qf.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//代理类需要实现InvocationHandler	
public class MyJdkProxy implements InvocationHandler{
	
	//目标对象，被代理的对象
	private Object object;
	
	public MyJdkProxy(Object object) {
		this.object = object;
	}
	
	
	//代理执行的方法
	/*
	 * proxy：代理的对象
	 * method:目标对象需要执行的方法名
	 * args:目标对象执行方法需要的参数*/
	public Object invoke(Object proxy, Method method, Object[] args)throws Throwable {
		System.out.println("代理的方法执行了！！！");
		
		//调用目标对象本身的业务方法
		Object ret = method.invoke(object, args);
		return ret;
	}
	        
}
