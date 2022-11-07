package com.codingdojo.javafinal.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class LoginUser {
	//========= Primary Key =================

	//========= Member Variable =================


		@NotEmpty(message="Email is required!")
	    @Email(message ="Please enter a valid email!")
		private String email;
		
		@NotEmpty(message="Password is required!")
	    @Size(min=3, max=30, message="Password must be between 3 and 30 characters")
		private String password;


	//========= Relationships =================


	//========= Data Creation Trackers =================


	//========= Constructors =================
		public LoginUser() {}



	//========= Data Creation Event ==============

	//========= Getters & Setters =================

		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


}