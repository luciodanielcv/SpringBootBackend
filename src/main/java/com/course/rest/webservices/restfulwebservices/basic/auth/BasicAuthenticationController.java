package com.course.rest.webservices.restfulwebservices.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BasicAuthenticationController {

		
	@GetMapping(path="/basicauth")
	public AuthenticationBean helloWorldBean() {
		//throw new RuntimeException( "Something went wrong!" );
		System.out.println("LDCV - Authenticated!");
		return new AuthenticationBean("LDCV - You are authenticated!");
	}
	
}
