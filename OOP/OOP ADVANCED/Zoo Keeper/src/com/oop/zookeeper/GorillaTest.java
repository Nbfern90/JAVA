package com.oop.zookeeper;

public class GorillaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla gorilla1 = new Gorilla();
		Bat bat1 = new Bat();
		
		gorilla1.eatBananas();
		gorilla1.eatBananas();
		gorilla1.climb();
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		
		bat1.fly();
		bat1.displayEnergy();
		bat1.fly();
		bat1.displayEnergy();
		bat1.eatHumans();
		bat1.displayEnergy();
		bat1.eatHumans();
		bat1.displayEnergy();
		bat1.attackTown();
		bat1.displayEnergy();
		bat1.attackTown();
		bat1.displayEnergy();
		bat1.attackTown();
		bat1.displayEnergy();
	}

}
