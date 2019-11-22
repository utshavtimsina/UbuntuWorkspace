package org.famas.main.controller;

import java.util.List;

import org.famas.main.mapper.QuestionAnswerSaveMapper;
import org.famas.main.model.Answer;
import org.famas.main.model.DeleteAnswerModel;
import org.famas.main.model.Question;
import org.famas.main.model.SubQuestion;
import org.famas.main.model.UserDto;
import org.famas.main.security.CustomUserDetails;
import org.famas.main.service.FormService;
import org.famas.main.util.Formatter;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.method.P;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping
@Controller
public class FormController {
	@Autowired
	FormService formService;
	BCryptPasswordEncoder passwordEncoder;
	@GetMapping("/error")
	@ResponseBody
	public String generateError() {
		return "There was an Error Accessing this Page";
	}
	@GetMapping("/")
	public String surveyPage() {
		return "Surveys";
	}

	@GetMapping("/getAll")
	@ResponseBody
	public Object getMyResult() {

		return formService.getDefinedSql();
	}
	
	@GetMapping("/getAuthenticatedFname")
	@ResponseBody
	public String getAuthenticatedUserName() {
		final CustomUserDetails authenticationToken = (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return authenticationToken.getUser().getFirstName();
	}
	
	@GetMapping("/questionSavePage")
	public String questionAnswersSavePage() {
		return "addData";
	}
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	@GetMapping("/register")
	public String registerNewUserPage() {
		return "register";
	}
	@PostMapping("/registerNewUser")
	@ResponseBody
	public void registerNewUserWithDetails(@RequestBody final UserDto st) {
		formService.saveNewUser(st);
		//return "hp";
	}
	
	@Autowired
	Formatter format;

	@PostMapping("/survey")
	@ResponseBody
	public Object saveUserSurveyAnswer(@RequestBody final String surveyAnswers) {
		//return surveyAnswers;
		final CustomUserDetails authen = (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if(!formService.hasUserAlreadySubmittedForm(authen.getUser().getId()) ) {
			formService.createNewUserSurvey(authen.getUser().getId());
			return format.formatter(surveyAnswers);
		}else {
			return "Form already submitted!!!";
		}
		

	}

	@PostMapping("/saveQuestionAnswers")
	@ResponseBody
	public Object saveQuestionAnswers(@RequestBody final QuestionAnswerSaveMapper questionAnswers) {
		final Question question = new Question();
		question.setqDescription(questionAnswers.getQuestion());
		question.setaType(questionAnswers.getRadio());

		if (questionAnswers.getRadio().equals("multiple")) {
			
			if (questionAnswers.getQuestions() != null && questionAnswers.getAnswers() != null) {
				for (final String questions : questionAnswers.getQuestions()) {
					final SubQuestion Subq = new SubQuestion();
					Subq.setqDescription(questions);
					for (final String ans : questionAnswers.getAnswers()) {
						final Answer answer = new Answer();
						answer.setaDescription(ans);
						Subq.getAnswer().add(answer);
					}
					question.getSubQuestion().add(Subq);
				}
			}
		} else {
			if (questionAnswers.getAnswers() != null) {

				for (final String ans : questionAnswers.getAnswers()) {
					final Answer answer = new Answer();
					answer.setaDescription(ans);
					question.getAnswer().add(answer);
				}
			}
		}
		 formService.saveQuestionAnswers(question);
		// return format.questionAnswerFormatter(questionAnswers);
		/// *
		 return question;
	}

	@GetMapping("/getUserById/{id}")
	@ResponseBody
	public Object getUserById(@PathVariable final int id) {
		return formService.getUserById(id);
	}

	@GetMapping("/admin")
	public String generateSurveyAnalysis() {
		return "admin";
	}

	@GetMapping("/adminIndividualResults/{id}")
	@ResponseBody
	public Object generateIndividualSurveyAnalysis(@PathVariable final int id) {
		if(formService.hasUserAlreadySubmittedForm(id)) {
			return formService.getResultsByUserId(id);
		}
		return "User has not submitted anything!!!!!";
	}
	
	
	@GetMapping("/graph")
	public String showGrpah() {
		return "infograph";
		
	}
	@GetMapping("/getAllUsers")
	@ResponseBody
	public Object getAllUsers() {
		return formService.getAllUsers();
	}

	@GetMapping("/overall")
	public Object generateOverallResult() {
		return "overall";
	}

	@GetMapping("/deleteQuestionAnswer")
	public String deleteQuestionAnswer(){
		return "admin";
	}

	@PostMapping("/delete")
	public Object deleteWithIds(@RequestBody DeleteAnswerModel ids){
		//return ids;
			
		if(ids.getQuestion() != null){
			for(int questId : ids.getQuestion()){
				formService.deleteQuestionById(questId);
			}
		}
		
		if(ids.getAnswer() != null){
			for(int ansId:ids.getAnswer())	{
				formService.deleteAnswerById(ansId);
			}	
		}
		if(ids.getSubquestion() != null){
			for(int subQuestId:ids.getSubquestion()){
				formService.deleteSubQuestionById(subQuestId);
			}
		}
		
		return "admin";
	}
	@GetMapping("/getCountByQuesAndAnsId")
	@ResponseBody
	public int getCountByQuesAndAnsId(@RequestParam("qid") int qid ,@RequestParam int aid){
		return qid;
	} 

	@GetMapping("/getCountByQuesSubQuesAndAnsId")
	@ResponseBody
	public int getCountByQuesSubQuesAndAnsId(@RequestParam int qid ,@RequestParam int  subQid ,@RequestParam int aid ){
		return qid;
	}
	@PostMapping("/updateQuestion")
	@ResponseBody
	public Object updateQuestions(@RequestBody List<Question> questions) {
		if(questions != null) {
			for(Question question :questions) {
				formService.updateQuestion(question); 
			}
			return "Update Success!!!";
		}
		return "Update Failed!!!";
	}
	@PostMapping("/updateAnswers")
	@ResponseBody
	public Object updateAnswers(@RequestBody List<Answer> answers) {
		if(answers != null) {
			for(Answer answer :answers) {
				formService.updateAnswer(answer); 
			}
			return "Update Success!!!";
		}
		return "Update Failed!!!";
		
	}
	@PostMapping("/updateSubQuestions")
	@ResponseBody
	public Object updateSubQuestions(@RequestBody List<SubQuestion> subquestions) {
		if(subquestions != null) {
			for(SubQuestion subquestion :subquestions) {
				formService.updateSubQuestion(subquestion); 
			}
			return "Update Success!!!";
		}
		return "Update Failed!!!";
		
	}


}
