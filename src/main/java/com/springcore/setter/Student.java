package com.springcore.setter;

public class Student 


{

	private int id ;
	private String name;
	private int age;
	
	private Subject s ;
	
	public Subject getS() {
		return s;
	}
	public void setS(Subject s) {
		this.s = s;
	}
	public int getId() {
		
		
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, int age, Subject s) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.s = s;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", s=" + s + "]";
	}
	
	
}
