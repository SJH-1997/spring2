package com.qf.pojo;

public class Car {
	private String color;
	private String name;
	
	public Car(String color, String name) {
		super();
		this.color = color;
		this.name = name;
	}

	public Car() {
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", name=" + name + "]";
	}
	
}
