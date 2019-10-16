package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.example.demo.model.Blog;
import com.example.demo.model.BlogRestData;


public interface BlogService {

	public Object fetchBlogs() ;
	
	public Object getBlogById(int id);
	public List<Blog> searchBlogs(String searchTerm);
	
	
	
}
