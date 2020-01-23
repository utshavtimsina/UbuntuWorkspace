package com.javainuse.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.config.JwtTokenUtil;

@RestController
@CrossOrigin()
public class HelloWorldController {
	@Autowired
	JwtTokenUtil tokenFormatter;
	@RequestMapping({ "/hello" })
	public String hello(@RequestHeader(value="Authorization") String authorizationHeader ) {
		 
		return "Hello World "+  tokenFormatter.getIdFromToken( authorizationHeader.substring(7))  ;
	}

}
