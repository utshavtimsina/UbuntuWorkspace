package org.famas.main.service.impl;

import org.famas.main.service.EmailService;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service
public class EmailServiceImpl implements EmailService{
	JavaMailSender emailSender;
	
	public EmailServiceImpl(JavaMailSender emailSender) {
		this.emailSender = emailSender;
	}

	@Override
	public String sendSimpleMessage() {
		// TODO Auto-generated method stub
		 SimpleMailMessage message = new SimpleMailMessage(); 
	        message.setTo("rockbrett03@gmail.com "); 
	        message.setSubject("hello"); 
	        message.setText("Hello Ashish bro ");
	        message.setFrom("admin@utshavtimsina.com.np");
	        emailSender.send(message);
	        return "send Success!!!!!!!";
	}

}
