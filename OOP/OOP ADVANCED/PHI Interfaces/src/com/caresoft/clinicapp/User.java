package com.caresoft.clinicapp;

//.. lots of existing imports .. //
public class User {
 protected Integer id;
 protected int pin;
 
 public User() {}
 
 public User(Integer id, int pin) {
	 this.id = id;
	 this.pin =pin;
 }

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public int getPin() {
	return pin;
}

public void setPin(int pin) {
	this.pin = pin;
}
 
 // TO DO: Getters and setters
 
 
 // ... you see lots of code here, and you can leave as is. Just add getters and setters)... //
}
