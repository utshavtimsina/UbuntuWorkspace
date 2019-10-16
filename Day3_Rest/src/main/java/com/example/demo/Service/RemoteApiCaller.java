package com.example.demo.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.ResponseData;
import com.example.demo.model.User;



@Service
public class RemoteApiCaller {
	@Autowired
	RestTemplate restTemplate;
	
	public Object getAllUsers() {
		HttpHeaders header = new HttpHeaders();
		header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		header.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		HttpEntity<String> entity = new HttpEntity<String>(null, header);
		
	ResponseEntity responseEntity = restTemplate.exchange("https://reqres.in/api/users/", HttpMethod.GET, entity, ResponseData.class);
		//List<User> users = (List<User>) responseEntity.getBody().getData();
		//System.out.println(responseEntity.getBody().getData());
//		Object responseEntity = restTemplate.exchange("https://api.hearthstonejson.com/v1/19776/enUS/cards.json", HttpMethod.GET,entity,Object.class);

      //  System.out.println(responseEntity.getBody());
		return ((ResponseData) responseEntity.getBody()).getData();
	}
}
