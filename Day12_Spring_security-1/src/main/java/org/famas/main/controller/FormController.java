package org.famas.main.controller;

import org.famas.main.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@RequestMapping
@Controller
public class FormController {
	@Autowired
	FormService formService;
	@GetMapping
	public String surveyPage() {
		return "index";
	}
	@GetMapping("/getAll")
	@ResponseBody public Object getMyResult() {
		return formService.getDefinedSql();
	}
}
