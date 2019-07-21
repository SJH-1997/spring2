package com.qf.proxy;

//jdk的动态代理被代理的对象必须要实现接口
public class Person implements IAnimal{
	public void say() {
		System.out.println("他正在笑!!!!");
	}
}
