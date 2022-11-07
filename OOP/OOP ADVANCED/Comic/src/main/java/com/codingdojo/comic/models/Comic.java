package com.codingdojo.comic.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Comic {
	//========= Primary Key =================
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

	//========= Member Variable =================
		@NotEmpty(message="Publisher is required!")
	    @Size(min=2, max=30, message="Publisher must be between 2 and 30 characters")
		private String publisher;
		
		@NotEmpty(message="Title is required!")
	    @Size(min=2, max=30, message="Title must be between 2 and 30 characters")
		private String title;
		
		@NotEmpty(message="Hero/Villan is required!")
	    @Size(min=2, max=30, message="Hero/Villan must be between 2 and 30 characters")
		private String herovillan;
		
		@NotEmpty(message="Date is required!")
	    @Size(min=2, max=30, message="Date must be between 2 and 30 characters")
		private String date;
		
		@NotEmpty(message="Author(s) is required!")
	    @Size(min=2, max=45, message="Author(s) must be between 2 and 45 characters")
		private String author;
		
		@NotEmpty(message="Arist(s) is required!")
	    @Size(min=2, max=45, message="Artist(s) must be between 2 and 45 characters")
		private String artist;
		
		@NotEmpty(message="Colorist(s) is required!")
	    @Size(min=2, max=45, message="Colorist(s) must be between 2 and 45 characters")
		private String colorist;
		
		@NotNull(message="Issue number is required!")
	    @Min(value = 1, message="Issue number must be at least 1 characters")
		@Max(value = 45, message="Issue number must not be greater than 45 characters")
		private Integer issue;
		
	//========= Relationships =================
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "user_id")
		private User user;

	//========= Constructors =================
		public Comic() {}
		
		public Comic(
				@NotEmpty(message = "Publisher is required!") @Size(min = 2, max = 30, message = "Publisher must be between 2 and 30 characters") String publisher,
				@NotEmpty(message = "Title is required!") @Size(min = 2, max = 30, message = "Title must be between 2 and 30 characters") String title,
				@NotEmpty(message = "Hero/Villan is required!") @Size(min = 2, max = 30, message = "Hero/Villan must be between 2 and 30 characters") String herovillan,
				@NotEmpty(message = "Date is required!") @Size(min = 2, max = 30, message = "Date must be between 2 and 30 characters") String date,
				@NotEmpty(message = "Author(s) is required!") @Size(min = 2, max = 45, message = "Author(s) must be between 2 and 45 characters") String author,
				@NotEmpty(message = "Arist(s) is required!") @Size(min = 2, max = 45, message = "Artist(s) must be between 2 and 45 characters") String artist,
				@NotEmpty(message = "Colorist(s) is required!") @Size(min = 2, max = 45, message = "Colorist(s) must be between 2 and 45 characters") String colorist,
				@NotNull(message = "Issue number is required!") @Min(value = 1, message = "Issue number must be at least 1 characters") @Max(value = 45, message = "Issue number must not be greater than 45 characters") Integer issue) {
			super();
			this.publisher = publisher;
			this.title = title;
			this.herovillan = herovillan;
			this.date = date;
			this.author = author;
			this.artist = artist;
			this.colorist = colorist;
			this.issue = issue;
		}
	//========= Data Creation Trackers =================
	
		@Column(updatable=false)
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private Date createdAt;
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private Date updatedAt ;
		
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

		public String getPublisher() {
			return publisher;
		}

		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getHerovillan() {
			return herovillan;
		}

		public void setHerovillan(String herovillan) {
			this.herovillan = herovillan;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getArtist() {
			return artist;
		}

		public void setArtist(String artist) {
			this.artist = artist;
		}

		public String getColorist() {
			return colorist;
		}

		public void setColorist(String colorist) {
			this.colorist = colorist;
		}

		public Integer getIssue() {
			return issue;
		}

		public void setIssue(Integer issue) {
			this.issue = issue;
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
