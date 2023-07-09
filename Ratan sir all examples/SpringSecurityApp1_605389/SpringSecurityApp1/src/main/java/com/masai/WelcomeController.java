package com.masai;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
		
	
	@PostMapping("/welcomeP")
	public ResponseEntity<String> welcomeHandler(){
		
	 return new ResponseEntity<String>("Welcome to Masai App welcomeP endpoint",HttpStatus.
   ACCEPTED);
	}
		
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welcomePHandler(){
		
			return new ResponseEntity<String>("Welcome to Masai App with Security welcome endpoint",HttpStatus
     .ACCEPTED);
	}

	@GetMapping("/admin")
	public ResponseEntity<String> adminHandler(){
		
		return new ResponseEntity<String>("Welcome to Masai App for Admin",HttpStatus.
					 ACCEPTED);
		}
	
	@GetMapping("/user")
	public ResponseEntity<String> userHandler(){
		
		return new ResponseEntity<String>("Welcome to Masai App for User",HttpStatus.
					 ACCEPTED);
	}
	
	
	
}