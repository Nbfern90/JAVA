package com.demo.interfaces;

public interface ACPowerable {
	Integer voltage = 120;
	Integer frequency = 60;
	
	abstract void unPlug();
	abstract boolean checkPluggedIn();
	//classes implementing ACPowerable are required to have these methods
	
	public default void hasPower() {
		String message ="The device is ";
		if(!checkPluggedIn()) {
			message += "not ";
		}
		System.out.println(message + "plugged in");
	}
	//If the class that is implementing this interface does not have this method defined, it's okay it can use this one

}
