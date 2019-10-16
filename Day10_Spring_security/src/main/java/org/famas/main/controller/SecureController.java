package org.famas.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SecureController {
	
	@GetMapping
	public String getMessage() {
		return "Message get Success!! ";
	}
	
}
