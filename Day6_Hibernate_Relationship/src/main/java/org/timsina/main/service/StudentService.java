package org.timsina.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.timsina.main.model.StudentDto;
import org.timsina.main.repository.StudentRepo;
@Service
public class StudentService {

	@Autowired
	StudentRepo studentRepo;
	public Iterable<StudentDto> getAllStudents(){
		
		return studentRepo.findAll();
	}
}
