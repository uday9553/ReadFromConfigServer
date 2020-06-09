package com.uday.springReadFromConfigServer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadFromConfigServerController {
	
	
	@GetMapping("/getFromConfigServer")
	public String getFromConfigServer() {
		return "Hii";
	}
}
