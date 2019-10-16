package com.example.demo.service;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.apache.http.entity.mime.Header;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.ResponseData;
@Service
public class MovieService {

	@Autowired
	RestTemplate template;
	
	/*
	 * public MovieService(RestTemplate response) { this.response = response; }
	 */
	
	

	public String generateResponse() {
		// TODO Auto-generated method stub
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<ResponseData> response = template.exchange("https://reqres.in/api/users/", HttpMethod.POST, entity, ResponseData.class);
		//ResponseEntity<ResponseData> response = template.getForEntity("https://reqres.in/api/users/", ResponseData.class);
		System.out.println(response.getBody().getData());
		return null;
	}

	
	
}
