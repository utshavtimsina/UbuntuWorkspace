package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserValues;
import com.example.demo.model.Users;
@Service
public class UserServiceImpl implements UserService {

	UserValues userValues = UserValues.getInstance();
	
	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		
		//userValues.getUserValues();
		return userValues.users;
	}

}
