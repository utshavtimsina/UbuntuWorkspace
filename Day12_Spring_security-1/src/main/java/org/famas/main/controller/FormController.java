package org.famas.main.controller;

import org.famas.main.model.Question;
import org.famas.main.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.famas.main.util.Formatter;

@RequestMapping
@Controller
public class FormController {
	@Autowired
	FormService formService;

	@GetMapping("")
	public String surveyPage() {
		return "Surveys";
	}

	@GetMapping("/getAll")
	@ResponseBody
	public Object getMyResult() {
		return formService.getDefinedSql();
	}

	@GetMapping("/questionSavePage")
	public String questionAnswersSavePage() {
		return "addData";
	}

	@Autowired
	Formatter format;

	@PostMapping("/survey")
	@ResponseBody
	public Object saveUserSurveyAnswer(@RequestBody String surveyAnswers) {
		// return surveyAnswers;
		return format.formatter(surveyAnswers);
		// return surveyService.saveUserSurveyAnswer(surveyAnswers);

	}
	
	@PostMapping("/saveQuestionAnswers")
	@ResponseBody public Object saveQuestionAnswers(@RequestBody String questionAnswers) { 
		Question question=(Question) format.questionAnswerFormatter(questionAnswers);
		return formService.saveQuestionAnswers(question);
		//return question.getqDescription();
		//return questionAnswers;
				//return format.questionAnswerFormatter(questionAnswers);
				///*
		
	}
	
}
