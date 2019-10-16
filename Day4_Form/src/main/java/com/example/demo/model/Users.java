package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;


public class Users {
	private int Id;
	private String fName;
	private String lName;
	private String userName;
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int id, String fName, String lName, String userName) {
		super();
		this.Id = id;
		this.fName = fName;
		this.lName = lName;
		this.userName = userName;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
