package com.qf.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class MyCglibProxy implements MethodInterceptor{
	
	//目标对象
	private Object ob;
	
	
	public MyCglibProxy(Object ob) {
		this.ob = ob;
	}


	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("搬山!");
		
		//目标对象的业务方法,第一个参数代表的是目标对象，第二个参数代表是目标对象方法的参数
		Object obj = methodProxy.invoke(ob, args);
		return obj;
	}
	
}
