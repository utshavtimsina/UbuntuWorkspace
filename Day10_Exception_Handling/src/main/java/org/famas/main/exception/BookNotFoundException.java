package org.famas.main.exception;

import org.springframework.http.HttpStatus;

public class BookNotFoundException extends Exception{
	private String msg;
	private HttpStatus status;
	public BookNotFoundException(String msg, HttpStatus status) {
		//super();
		this.msg = msg;
		this.status = status;
	}
	public BookNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	
}
