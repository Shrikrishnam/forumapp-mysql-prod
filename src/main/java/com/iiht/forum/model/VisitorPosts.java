package com.iiht.forum.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "postdata")
public class VisitorPosts {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "postid")
	private Long postId;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "tags")
	private String tags;
	
	@Column(name = "postDescription")
	private String postDescription;
	
	

	public VisitorPosts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VisitorPosts(Long postId, String title, String tags, String postDescription) {
		super();
		this.postId = postId;
		this.title = title;
		this.tags = tags;
		this.postDescription = postDescription;
	}

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getPostDescription() {
		return postDescription;
	}

	public void setPostDescription(String postDescription) {
		this.postDescription = postDescription;
	}
	
	
	
}