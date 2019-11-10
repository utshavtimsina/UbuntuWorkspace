package org.famas.main.globalException;



import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler(Exception.class)
	ResponseEntity<ExceptionFormatter> generateCustomConstantVoilationException(Exception e){
		ExceptionFormatter formatter =new ExceptionFormatter(e.getLocalizedMessage(),HttpStatus.BAD_REQUEST);
		return new ResponseEntity<ExceptionFormatter>(formatter,formatter.getStatus());
	}
}
