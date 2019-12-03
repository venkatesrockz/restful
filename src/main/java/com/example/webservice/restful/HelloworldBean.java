package com.example.webservice.restful;

public class HelloworldBean {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HelloworldBean(String message) {
		// TODO Auto-generated constructor stub
		
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloworldBean [message=" + message + "]";
	}
	
	

}
