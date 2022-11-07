package com.codingdojo.javafinal.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "courses")
public class Course {
	//========= Primary Key =================
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

	//========= Member Variable =================
		@NotEmpty(message="Class Name is required!")
	    @Size(min=3, max=30, message="Class Name must be between 3 and 30 characters")
		private String courseName;
		
		@NotEmpty(message="Weekday is required!")
	    @Size(min=3, max=30, message="Weekday must be between 3 and 12 characters")
		private String weekday;
		
		@NotNull()
		@DecimalMin(value ="1.0", message ="Must be more than $1.00")
		private double price;

		@NotEmpty(message="Description is required!")
	    @Size(min=3, max=128, message="Description must be between 3 and 128 characters")
		private String description;


	//========= Relationships =================
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "user_id")
		private User user;

	//========= Data Creation Trackers =================

		@Column(updatable=false)
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private Date createdAt;
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private Date updatedAt ;
		


	//========= Constructors =================
		public Course() {}
		

		public Course(
				@NotEmpty(message = "Class Name is required!") @Size(min = 3, max = 30, message = "Class Name must be between 3 and 30 characters") String courseName,
				@NotEmpty(message = "Weekday is required!") @Size(min = 3, max = 30, message = "Weekday must be between 3 and 12 characters") String weekday,
				@NotNull @DecimalMin(value = "1.0", message = "Must be more than $1.00") double price,
				@NotEmpty(message = "Description is required!") @Size(min = 3, max = 128, message = "Description must be between 3 and 128 characters") String description,
				User user) {
			super();
			this.courseName = courseName;
			this.weekday = weekday;
			this.price = price;
			this.description = description;
			this.user = user;
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


		public String getCourseName() {
			return courseName;
		}


		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}


		public String getWeekday() {
			return weekday;
		}


		public void setWeekday(String weekday) {
			this.weekday = weekday;
		}


		public double getPrice() {
			return price;
		}


		public void setPrice(double price) {
			this.price = price;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public User getUser() {
			return user;
		}


		public void setUser(User user) {
			this.user = user;
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
