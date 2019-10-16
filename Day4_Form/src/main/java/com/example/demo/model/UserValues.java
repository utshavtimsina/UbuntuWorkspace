package com.example.demo.model;

import java.util.List;

import org.springframework.stereotype.Service;


public class UserValues {
	public List<Users> users;
	
	public static UserValues instance = null;
	
	private  UserValues() {
		// TODO Auto-generated constructor stub
		users.add(new Users(1,"Utshav","Timsina","team_sina"));
	}
	public static UserValues getInstance() {

		if(instance == null) {
			instance=new UserValues();
		}
		return instance;
	}
	
	
	
}
