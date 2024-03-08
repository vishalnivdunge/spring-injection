package com.springcore.setter;

public class Subject {
	
	private String name ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Subject [name=" + name + "]";
	}
	

}
