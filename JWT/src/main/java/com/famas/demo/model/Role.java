package com.famas.demo.model;

import java.io.Serializable;

public class Role  implements Serializable{
	private static final long serialVersionUID = -5811441585809785188L;
	private int role_id;
	private String role;
	
	public Role() {
	}
	public Role(int role_id, String role) {
		this.role_id = role_id;
		this.role = role;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
