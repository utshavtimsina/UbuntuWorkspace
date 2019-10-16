package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Blog;
import com.example.demo.model.BlogRestData;
@Service
public class BlogServiceImpl implements BlogService {
	@Autowired
	BlogRestData blog;
	
	public Object fetchBlogs() {
		//System.out.println(blog.toString());
		
		
        return blog.getBlog();
    }

	public Object getBlogById(int id) {
		 List <Blog> blogss =  blog.getBlog();
		for(Blog blogs:blogss) {
			
			if(blogs.getId()==id) {
				return blogs;
			}
			
		} 
		
		
		return null;
	}

	public List<Blog> searchBlogs(String searchTerm) {
		// TODO Auto-generated method stub4
		List <Blog> foundBlogs=new ArrayList<>();
		
		for(Blog b:  blog.getBlog()) {
			
		}
		 
		
		return null;
	}

	
}
