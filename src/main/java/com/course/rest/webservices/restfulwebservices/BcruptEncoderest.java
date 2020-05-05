package com.course.rest.webservices.restfulwebservices;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcruptEncoderest {

	public static void main( String args[]) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		for( int i = 0; i <= 10; i++) {
			String encodedString = encoder.encode("password@!23k");
			System.out.println(encodedString);
		}
		
		
	}
}
