package com.qf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.qf.pojo.Person;
import com.qf.service.PersonService;

@Controller
public class PersonController {
	
	@Autowired	//�������Զ�ע��
	private PersonService personService;
	
	
	public void show() {
		Person person = personService.getPerson(10);
		System.out.print(person.toString());
	}

}
