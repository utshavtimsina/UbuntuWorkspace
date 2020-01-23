package com.example.demo.services;

import org.jdbi.v3.core.Jdbi;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MsSqlRepository;

@Service
public class Services {
	
	Jdbi jdbi;
	MsSqlRepository repo;
	public Services(Jdbi jdbi) {
		this.jdbi = jdbi;
		repo = jdbi.onDemand(MsSqlRepository.class);
	}
	
	public Object getAllUsers() {
		return repo.getAllUsers();
	}

	
}
