package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Users;
import com.example.demo.services.UserServiceImpl;

@RestController
@RequestMapping("/")
public class UserController {
	@Autowired
	UserServiceImpl userService;
	
	@GetMapping
	public String getAllUsers(){
	List<Users> users =	userService.getAllUsers();
		return "Success";
	}

}
