package com.springcoreconstructor;

public class person {
	
	private int id ;
	private String name;
	private Adhar adh ;
	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + "]";
	}
	public person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public person(int id, String name, Adhar adh) {
		super();
		this.id = id;
		this.name = name;
		this.adh = adh;
	}
	
	
}
