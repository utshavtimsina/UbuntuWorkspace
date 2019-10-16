package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Blog;
import com.example.demo.model.BlogRestData;
import com.example.demo.service.BlogService;
import com.example.demo.service.BlogServiceImpl;
import com.example.demo.service.MovieService;

@RestController
@RequestMapping("/")
public class BlogController {
	
	 @Autowired
	  MovieService movieService;
	
	@Autowired
	BlogServiceImpl blogObj;
	
	@GetMapping("/blog")
	public  Object fetchBlog() {
		
		return blogObj.fetchBlogs();
	}
	
	
	@GetMapping("/blog/{id}")
	public Object getBlogById(@PathVariable int id) {
		return blogObj.getBlogById(id);
		
	}
	
	  @GetMapping("/blog/search")
	    public List<Blog> search(@RequestBody String searchTerm){
	       
	        return blogObj.searchBlogs(searchTerm);
	    }
	  
	  @GetMapping("/movies")
	  public Object viewResponse() {
		 
		return movieService.generateResponse();
		  
		  
		//return blogObj;
		  
	  }
	
}
