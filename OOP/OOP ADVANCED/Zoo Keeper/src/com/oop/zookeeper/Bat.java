package com.oop.zookeeper;

public class Bat extends Mammal {

	public Bat() {
		super();
		this.energylevel = 300;
		
	}

	public Bat(int energylevel) {
		super(energylevel);
		
	}
	
	public void fly() {
		System.out.println("Woosh?");
		this.energylevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("Not the face! Not the face!");
		this.energylevel += 50;
	}
	
	public void attackTown() {
		System.out.println("It burns! It burns!");
		this.energylevel -= 100;
		
		
	}
	
	

}
