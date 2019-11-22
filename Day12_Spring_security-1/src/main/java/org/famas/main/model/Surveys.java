package org.famas.main.model;

import java.io.Serializable;

public class Surveys implements Serializable {
	private static final long serialVersionUID = 182014846975405027L;

	private int sId;

	private int uId;
	
	

	public Surveys() {
		
	}

	public Surveys(int sId, int uId) {
		//super();
		this.sId = sId;
		this.uId = uId;
		
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	

}
