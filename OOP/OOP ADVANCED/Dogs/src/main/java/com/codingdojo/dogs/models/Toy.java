package com.codingdojo.dogs.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "toys")
public class Toy {
	//========= Primary Key =================
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

	//========= Member Variable =================
		private String name;
		private String type;
		private Boolean squeaky;



	//========= Relationships ==================
		@ManyToMany(fetch = FetchType.LAZY)
		@JoinTable(
			name = "dogs_toys",
			joinColumns = @JoinColumn(name = "toy_id"),
			inverseJoinColumns = @JoinColumn(name = "dog_id")
				)
		private List <Dog> dogs;
		
		

	//========= Data Creation Trackers =================

		@Column(updatable=false)
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private Date createdAt;
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private Date updatedAt ;
		


	//========= Constructors =================
		public Toy() {}


	public Toy(String name, String type, Boolean squeaky) {
			super();
			this.name = name;
			this.type = type;
			this.squeaky = squeaky;
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


		public String getType() {
			return type;
		}


		public void setType(String type) {
			this.type = type;
		}


		public Boolean getSqueaky() {
			return squeaky;
		}


		public void setSqueaky(Boolean squeaky) {
			this.squeaky = squeaky;
		}


		public List<Dog> getDogs() {
			return dogs;
		}


		public void setDogs(List<Dog> dogs) {
			this.dogs = dogs;
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
