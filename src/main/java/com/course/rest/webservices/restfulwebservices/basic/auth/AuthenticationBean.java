package com.course.rest.webservices.restfulwebservices.basic.auth;

public class AuthenticationBean {
	
	
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public AuthenticationBean() {
		
	}
	public AuthenticationBean( String message ) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("HelloWorldBean [message=%s]", message);
	}
	
	

}
