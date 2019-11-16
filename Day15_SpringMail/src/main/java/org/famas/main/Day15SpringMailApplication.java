package org.famas.main;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@SpringBootApplication
public class Day15SpringMailApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day15SpringMailApplication.class, args);
	}

	@Bean
	public JavaMailSender getJavaMailSender() {
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost("mail1.runhosting.com");
		// mailSender.setHost("smtp.gmail.com");
		mailSender.setPort(587);

		mailSender.setUsername("admin@utshavtimsina.com.np");
		mailSender.setPassword("phidim123");
		// mailSender.setHost("admin@utshavtimsina.com.np");
		Properties props = mailSender.getJavaMailProperties();
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.starttls.required", "true");
		props.put("mail.debug", "true");
		// props.put("mail.smtp.from", "admin@utshavtimsina.com.np");
		return mailSender;
	}
}
