package com.simplejava.aws.greeting;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Greeting {
	
	private long id;
	private String message;
	private LocalDateTime time;
	private String hostName;
	private String ipAddress;

}
