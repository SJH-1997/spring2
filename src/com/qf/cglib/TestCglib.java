package com.qf.cglib;

import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;

public class TestCglib {
	
	@Test
	public void test() {
		//����Ŀ�����
		Teacher tea = new Teacher();
		
		//�����������
		MyCglibProxy proxy = new MyCglibProxy(tea);
		//cglib������
		Enhancer enhancer = new Enhancer();
		//��Ŀ���������Ϊ���࣬��Ҳ�Ǹ�jdk��̬���������
		enhancer.setSuperclass(tea.getClass());
		//ִ�лص�
		enhancer.setCallback(proxy);
		//���ɾ���Ĵ������
		Teacher t = (Teacher)enhancer.create();
		//ͨ���������ִ��ҵ�񷽷�
		t.say();
	}
}
