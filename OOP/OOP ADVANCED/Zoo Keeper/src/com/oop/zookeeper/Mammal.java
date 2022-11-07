package com.oop.zookeeper;

public class Mammal {

	public int energylevel;
	
	public Mammal() {
		this.energylevel = 100;
	}
	
	public Mammal(int energylevel) {
		this.energylevel = energylevel;
	}


	public int displayEnergy() {
		System.out.println(this.energylevel);
		return energylevel;
	}
	
	//Getters & Setters

	public int getEnergylevel() {
		return energylevel;
	}

	public void setEnergylevel(int energylevel) {
		this.energylevel = energylevel;
	}
}
