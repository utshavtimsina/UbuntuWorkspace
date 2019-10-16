package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {

	
	UserRepository userRepository;
	Iterable<User> users;
	public UserServiceImpl(UserRepository userRepository) {
		
		this.userRepository = userRepository;
	}
	

	public Iterable<User> getAllUsers() {
		// TODO Auto-generated method stub
		
		users=userRepository.findAll();
		return users;
	}

	

	@Override
	public String addNewUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
		
		return "success";
	}


	@Override
	public Optional<User> updateUser(int userId, User user) {
		// TODO Auto-generated method stub
		
		if(userRepository.existsById(userId)) {
			Optional<User> updateUser= userRepository.findById(userId);
				User updatedUser=updateUser.get();
				updatedUser.setUserName(user.getUserName());
				updatedUser.setFirstName(user.getFirstName());
				updatedUser.setLastName(user.getLastName());
				updatedUser.setPhoneNo(user.getPhoneNo());
				
				userRepository.save(updatedUser);
				return updateUser;
			
		}
		return null;
	}


	@Override
	public Optional<User> getUserById(int userId) {
		// TODO Auto-generated method stub
		
		
		return userRepository.findById(userId);
	}

}
