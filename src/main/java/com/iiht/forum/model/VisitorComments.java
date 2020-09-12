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
@Table(name = "comments")
public class VisitorComments 
{
	
	
	
	public VisitorComments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VisitorComments(Long commentId, Long postId, String tags, String visitorComment) {
		super();
		this.commentId = commentId;
		this.postId = postId;
		this.tags = tags;
		this.visitorComment = visitorComment;
	}

	public Long getCommentId() {
		return commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getVisitorComment() {
		return visitorComment;
	}

	public void setVisitorComment(String visitorComment) {
		this.visitorComment = visitorComment;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "commentid")
	private Long commentId;
	
	@Column(name = "postid")
	private Long postId;

	@Column(name = "tags")
	private String tags;
	
	@Column(name = "comment")
	private String visitorComment;

}