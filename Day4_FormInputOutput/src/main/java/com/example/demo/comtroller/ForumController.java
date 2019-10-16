package com.example.demo.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class ForumController {
	@GetMapping
	public String displayForum() {
		return "feedback-forum";
	}
	@GetMapping("/user")
	public @ResponseBody String displayExample() {
		return "index";
	}
	
}
