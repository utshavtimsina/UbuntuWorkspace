package com.example.demo.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Feedback;

@Controller
@RequestMapping("/")
public class ForumController {
	@GetMapping
	public String displayForum() {
		return "feedback-forum";
	}
	@PostMapping("/showResult")
	public @ResponseBody String displayExample(@RequestBody String request) {
		return   request;
	}
	@PostMapping("/getForumData")
	public @ResponseBody String getForumData(@RequestBody String value) {
		return value.toString();
	}
	@GetMapping("/getUrl")
	public String urlParsor() {
		return "index";
	}
	
}
