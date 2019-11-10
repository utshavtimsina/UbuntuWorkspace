package org.famas.main.controller;

import org.famas.main.model.Question;
import org.famas.main.security.CustomUserDetails;
import org.famas.main.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	BCryptPasswordEncoder passwordEncoder;
	@GetMapping("/")
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
		/*
		 * SecurityContext authentication = SecurityContextHolder.getContext();
		 * CustomUserDetails currentPrincipalName = (CustomUserDetails)
		 * authentication.getAuthentication().getPrincipal(); return
		 * currentPrincipalName;
		 */
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
	@GetMapping("/admin")
	public String generateSurveyAnalysis() {
		return "index";
	}
	@GetMapping("/adminIndividualResults/{id}")
	@ResponseBody public Object generateIndividualSurveyAnalysis(@PathVariable int id ) {
		
		return formService.getResultsByUserId(id);
	}
	@GetMapping("/getAllUsers")
	@ResponseBody public Object getAllUsers() {
		return formService.getAllUsers();
	}
	
	@GetMapping("/overall")
	@ResponseBody public Object generateOverallResult() {
		return formService.generateOverallResult();
	}
}
