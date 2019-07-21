package com.qf.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

//复杂类型的注入
public class Teacher {
	private String name;
	private String[] strs;
	private List<String> list;
	private Map<String, String> maps;
	private Properties pro;
	
	public Teacher(String name, String[] strs, List<String> list, Map<String, String> maps, Properties pro) {
		this.name = name;
		this.strs = strs;
		this.list = list;
		this.maps = maps;
		this.pro = pro;
	}
	
	public Teacher() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getStrs() {
		return strs;
	}

	public void setStrs(String[] strs) {
		this.strs = strs;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, String> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}

	public Properties getPro() {
		return pro;
	}

	public void setPro(Properties pro) {
		this.pro = pro;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", strs=" + Arrays.toString(strs) + ", list=" + list + ", maps=" + maps
				+ ", pro=" + pro + "]";
	}
	
	
	
}
