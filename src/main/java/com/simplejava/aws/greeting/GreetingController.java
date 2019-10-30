package com.simplejava.aws.greeting;

import java.net.InetAddress;
import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greeting")
public class GreetingController {
	
	@GetMapping(path="",produces="application/json")
	public ResponseEntity<Greeting> sayGreeting(){
		Greeting greeting = new Greeting(generateRandom(), "Hello World", LocalDateTime.now(),getHostName(),
				getIP());
		return new ResponseEntity<Greeting>(greeting,HttpStatus.OK);
		
	}
	/****
	 * 
	 * @return
	 */
	private String getHostName() {
		try {
			return InetAddress.getLocalHost().getHostName();
			
		}catch(Exception ex) {
			return "";
		}
	}
	/***
	 * 
	 * @return
	 */
	private String getIP() {
		try {
			return String.valueOf(InetAddress.getLocalHost());
			
		}catch(Exception ex) {
			return "";
		}
	}
	
	private long generateRandom() {
	    return new Random().nextLong();
	}
}
