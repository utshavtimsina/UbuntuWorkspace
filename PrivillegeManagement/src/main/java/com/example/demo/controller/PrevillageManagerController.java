package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.Services;
@RequestMapping("/")
@RestController
public class PrevillageManagerController {
	private Services service;
	public PrevillageManagerController(Services service) {
		this.service = service;
	}
	@GetMapping("/")
	public Object getAllUsers() {
		return service.getAllUsers();
	}
}
