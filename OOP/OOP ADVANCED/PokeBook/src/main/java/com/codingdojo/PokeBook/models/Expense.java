package com.codingdojo.PokeBook.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="pokebook")
public class Expense {
	//========= Primary Key =================
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

	//========= Member Variable =================
		@NotNull()
		@Size(min = 2, message ="Must be longer than two characters.")
		private String name;
		
		@NotNull()
		@Size(min = 2, message ="Must be longer than two characters.")
		private String vendor;
		
		@NotNull()
		@DecimalMin(value ="1.0", message ="Must be more thant $1.00")
		private double amount;
		
		@NotNull()
		@Size(min = 2, message ="Must be longer than two characters.")
		private String description;




	//========= Data Creation Trackers =================

		@Column(updatable=false)
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private Date createdAt;
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private Date updatedAt ;
		

	//========= Constructors =================
		public Expense() {}
		
		


	public Expense(@NotNull @Size(min = 2, message = "Must be longer than two characters.") String name,
				@NotNull @Size(min = 2, message = "Must be longer than two characters.") String vendor,
				@NotNull @DecimalMin(value = "1.0", message = "Must be more thant $1.00") double amount,
				@NotNull @Size(min = 2, message = "Must be longer than two characters.") String description) {
			super();
			this.name = name;
			this.vendor = vendor;
			this.amount = amount;
			this.description = description;
		}




		//========= Data Creation Event ==============
		@PrePersist
		protected void onCreate() {
			this.createdAt = new Date();
		}
		@PreUpdate
		protected void onUpdate() {
			this.updatedAt = new Date();
		}

		//========= Getters & Setters =================


		public Long getId() {
			return id;
		}




		public void setId(Long id) {
			this.id = id;
		}




		public String getName() {
			return name;
		}




		public void setName(String name) {
			this.name = name;
		}




		public String getVendor() {
			return vendor;
		}




		public void setVendor(String vendor) {
			this.vendor = vendor;
		}




		public double getAmount() {
			return amount;
		}




		public void setAmount(double amount) {
			this.amount = amount;
		}




		public String getDescription() {
			return description;
		}




		public void setDescription(String description) {
			this.description = description;
		}




		public Date getCreatedAt() {
			return createdAt;
		}




		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}




		public Date getUpdatedAt() {
			return updatedAt;
		}




		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}
		
		

		
		
}
