package com.qf.dao;

import com.qf.pojo.Person;

public interface PersonDao {
	//根据id获取
	public abstract Person getPerson(int id);
}
