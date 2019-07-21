package com.qf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qf.dao.PersonDao;
import com.qf.pojo.Person;
import com.qf.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonDao personDao;
	
	
	//根据id获取
	public Person getPerson(int id) {
		Person person = personDao.getPerson(id);
		return person;
	}

}
