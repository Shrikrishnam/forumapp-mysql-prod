package com.iiht.forum.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class VisitorPostsDto {
	private long postId;
	private String title;
	private String tags;
	private String postDescription;
	public VisitorPostsDto(long postId, String title, String tags, String postDescription) {
		super();
		this.postId = postId;
		this.title = title;
		this.tags = tags;
		this.postDescription = postDescription;
	}
	public VisitorPostsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getPostId() {
		return postId;
	}
	public void setPostId(long postId) {
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