package com.iiht.forum.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class PostExceptionResponse {
	public PostExceptionResponse(String message, long timeStamp, int status) {
		super();
		this.message = message;
		this.timeStamp = timeStamp;
		this.status = status;
	}
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public PostExceptionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	private long timeStamp;
	private int status;
	
	
}