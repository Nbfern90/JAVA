package com.oop.zookeeper;

public class Gorilla extends Mammal {
	

	public Gorilla(int energylevel) {
		super(energylevel);
		// TODO Auto-generated constructor stub
	}
	

	public Gorilla() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public void throwSomething() {
		System.out.println("The Gorilla has flung something");
		this.energylevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("The Gorilla enjoys his banana");
		this.energylevel += 10;
	}
	
	public void climb() {
		System.out.println("The Gorilla climbs a tree");
		this.energylevel -= 10;
		
	}


}
