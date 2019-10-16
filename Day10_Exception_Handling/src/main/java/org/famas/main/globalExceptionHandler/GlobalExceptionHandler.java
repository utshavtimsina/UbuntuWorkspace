package org.famas.main.globalExceptionHandler;

import org.famas.main.exception.BookNotFoundException;
import org.famas.main.exception.ExceptionFormatter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	public GlobalExceptionHandler() {
		// TODO Auto-generated constructor stub
	}
	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<ExceptionFormatter> handleBookNotFoundExceptionBook(BookNotFoundException ex) {
		ExceptionFormatter formatter = new ExceptionFormatter(ex.getMsg(),ex.getStatus());
		return new ResponseEntity<ExceptionFormatter>(formatter,ex.getStatus());
	}
	
}
