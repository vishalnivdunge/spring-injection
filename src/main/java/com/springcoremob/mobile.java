package com.springcoremob;

public class mobile {
	
	
	private String name ;
	private int generation ;
	private int price ;
	@Override
	public String toString() {
		return "mobile [name=" + name + ", generation=" + generation + ", price=" + price + "]";
	}
	public mobile(String name, int generation, int price) {
		super();
		this.name = name;
		this.generation = generation;
		this.price = price;
	}
	public mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGeneration() {
		return generation;
	}
	public void setGeneration(int generation) {
		this.generation = generation;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
