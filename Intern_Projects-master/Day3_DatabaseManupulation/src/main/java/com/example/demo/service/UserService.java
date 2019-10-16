package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.User;

public interface UserService {
	
	public Iterable<User> getAllUsers();
	public String addNewUser(User user);
	public Optional<User> updateUser(int userId,User user);
	public Optional<User> getUserById(int userId);
}
