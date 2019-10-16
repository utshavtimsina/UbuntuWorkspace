package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
	private int Id;
	private String userName;
	private String firstName;
	private String lastName;
	private String phoneNo;
	public User() {
	
		// TODO Auto-generated constructor stub
	}
	public User(int id, String userName, String firstName, String lastName, String phoneNo) {
		super();
		Id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNo=" + phoneNo + "]";
	}
	
	
}
