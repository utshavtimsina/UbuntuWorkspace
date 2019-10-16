package com.example.demo.Service;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class RestServiceImpl implements RestService{

	
	Logger logger=LoggerFactory.getLogger(RestServiceImpl.class);
	RestTemplate restTemplate;
	public RestServiceImpl(RestTemplate restTemplate) {
		this.restTemplate=restTemplate;
	}
	
	
	public Object getUriValues() {

		HttpHeaders header=new HttpHeaders();
		header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		header.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		HttpEntity<String> entity = new HttpEntity<String>(null, header);
		String uri = "https://reqres.in/api/users?page=2";
			//String url="https://www.metaweather.com/api/location/search/?query=san";
			String url="http://www.ipasal.ishanitech.com:8080/api/v1/category";
			Object response=restTemplate.exchange(uri, HttpMethod.GET, entity, Object.class);
					//exchange(url, HttpMethod.GET, header,null, );
			System.out.println(response.toString());
			logger.info( response.toString());
		return response;
		
		
		
	}
}
