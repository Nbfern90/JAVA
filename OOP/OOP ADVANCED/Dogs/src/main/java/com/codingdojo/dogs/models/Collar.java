package com.codingdojo.dogs.models;

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
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="collars")
public class Collar {
	
	//========= Primary Key =================
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

	//========= Member Variable =================
		@Size(min =2)
		private String color;
	
	//========= Relationships =================
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dog_id")
	private Dog dog;


	//========= Data Creation Trackers =================

		@Column(updatable=false)
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private Date createdAt;
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private Date updatedAt ;
		


	//========= Constructors =================
		public Collar() {}
		
		public Collar(String color) {
			this.color = color;
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

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public Dog getDog() {
			return dog;
		}

		public void setDog(Dog dog) {
			this.dog = dog;
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
