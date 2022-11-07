package com.bro.brointerface;

public class Test {


	public static void main(String[] args) {
		// interface = a template that can be applied to a class. Similar to inheritance, but specifies what a class has/must do.
		//classes can apply more than one interface, inheritance is limited to 1 super
		
		Rabbit rabbit1 = new Rabbit();
		
		Hawk hawk1 = new Hawk();
		
		Fish fish1 = new Fish();
		
		
		
		rabbit1.flee();
		hawk1.hunt();
		
		fish1.hunt();
		fish1.flee();

	}

}
