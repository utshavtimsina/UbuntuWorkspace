package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.RemoteApiCaller;
import com.example.demo.Service.RestServiceImpl;

@RestController
public class RestControllers {
	
	
	@Autowired
	RemoteApiCaller restService;
	RestServiceImpl restImpl;
	
	
	@RequestMapping("/")
	public Object getRestData() {
		
		return restService.getAllUsers();
	}
		
	@RequestMapping("/next")
	public Object getRestData1() {
		
		return restImpl.getUriValues();
	}
}
