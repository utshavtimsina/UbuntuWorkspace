package org.timsina.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.timsina.main.model.StudentDto;
import org.timsina.main.service.StudentService;

@RestController
@RequestMapping("/")

public class RequestController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping
	public Iterable<StudentDto> getAllStudents(){
		return studentService.getAllStudents();
		
		
	}
}
