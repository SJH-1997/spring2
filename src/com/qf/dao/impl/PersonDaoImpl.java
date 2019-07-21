package com.qf.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.qf.dao.PersonDao;
import com.qf.pojo.Person;

@Repository
public class PersonDaoImpl implements PersonDao {
	
	//根据id获取
	public Person getPerson(int id) {
		Person p = new Person();
		p.setId(11);
		p.setName("董洁");
		return p;
	}

}
