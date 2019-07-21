package com.qf.proxy;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class TestProxy {
	
	@Test
	public void test() {
		//����Ŀ�����
		IAnimal person = new Person();
		
		//�����������
		MyJdkProxy jdkProxy = new MyJdkProxy(person);
		//person.getClass().getClassLoader()Ŀ������ֽ�����ض���
		///person.getClass().getInterfaces(), jdkProxyĿ�����ʵ�ֵĽӿ�
		IAnimal a = (IAnimal)Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), jdkProxy);
		
		//ͨ���������ִ��ҵ�񷽷�
		a.say();
		
	}
}
