package com.codingdojo.myfirstpackage;

public class Dog {
	private String name;
	private String hairColor;
	
	public Dog(String name, String hairColor) {
		super();
		this.name = name;
		this.hairColor = hairColor;
	}
	
	public void borf() {
		System.out.println("My name is " + this.name + ", I am " + this.hairColor );
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	
	

}
