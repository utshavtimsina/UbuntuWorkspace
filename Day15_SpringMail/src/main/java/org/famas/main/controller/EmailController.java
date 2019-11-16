package org.famas.main.controller;

import org.famas.main.service.impl.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping( "/")
@RestController
public class EmailController {
   
   @Autowired 
   EmailServiceImpl emailService;
   @GetMapping("/sendMail")
   public String sendEmail() {
      return emailService.sendSimpleMessage();
   }   
}