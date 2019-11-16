package org.famas.main.service;

import java.net.URL;

import org.famas.main.model.Payment;
import org.famas.main.model.Verify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PaymentVerification {
	@Autowired
	private RestTemplate restTemplate;
	private String url;
	private String header;
	private String token;
	private int amount;
	private Payload payload;

	public PaymentVerification() {
		url = "https://khalti.com/api/v2/payment/verify/";
		header = "Key test_secret_key_6a0df8e12d0d4bd68f4cfcc23087b9c6";
	}

	public Object SendToken(Payment pay) {
		token = pay.getToken();
		amount = pay.getAmount();
		payload = new Payload(token, amount);
		return isPaymentVerified();
	}

	private Object isPaymentVerified() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", header);
		headers.setContentType(MediaType.APPLICATION_JSON);
		ObjectMapper mapper = new ObjectMapper();
		HttpEntity<String> requestEntity;
		try {
			requestEntity = new HttpEntity<String>(mapper.writeValueAsString(payload), headers);
			ResponseEntity<Verify> verify = restTemplate.exchange(url, HttpMethod.POST, requestEntity,
					Verify.class);

			return verify;
			
		} catch (JsonProcessingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch (Exception e) {
			log.info(e.getLocalizedMessage());
			//return error;
		}
		return null;
		

	}
}