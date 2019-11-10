package org.famas.main.globalException;

import org.springframework.http.HttpStatus;

public class ExceptionFormatter {
	private String errorMsg;
	private HttpStatus status;
	public ExceptionFormatter() {
		// TODO Auto-generated constructor stub
	}
	public ExceptionFormatter(String errorMsg, HttpStatus status) {
		this.errorMsg = errorMsg;
		this.status = status;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	
}
