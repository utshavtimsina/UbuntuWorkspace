package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.service.UserServiceImpl;



@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserServiceImpl userService;
	
	public UserController(UserServiceImpl userService) {
		// TODO Auto-generated constructor stub
		this.userService=userService;
	}
	@GetMapping
	public Iterable<User> getAllUsers(){
		
		return userService.getAllUsers();
		
	}
	
	@GetMapping("/{userId}")
	public Optional<User> getUserById(@PathVariable int userId) {
		
		return  userService.getUserById(userId);
	}
	
	@PostMapping
	public String addNewUser(@RequestBody User user) {
		
		return userService.addNewUser(user);
	}
	
	
	@PutMapping("/{userId}")
	public Optional<User> updateUser(@PathVariable int userId,@RequestBody User user) {
		
		
		return userService.updateUser(userId, user);
		
	}
	
	

	
	
	
	
	
	
}
