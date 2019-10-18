package org.famas.main.controller;

import org.famas.main.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping
@RestController
public class FormController {
	@Autowired
	FormService formService;
	@GetMapping
	public Object getMyResult() {
		return formService.getDefinedSql();
	}
}
