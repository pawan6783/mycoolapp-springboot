package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
		
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	// expose "/" that return "Hello World"
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach name= "+coachName+" team name= "+teamName;
	}
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on server is " + LocalDateTime.now();
	}
	

	@GetMapping("/workout")
	public String getWorkout() {
		return "Do work out for 1 hr."; 
	}
}












