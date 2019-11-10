package org.famas.main.service;

import java.util.List;
import java.util.Optional;

import org.famas.main.model.Answer;
import org.famas.main.model.Question;
import org.famas.main.model.SurveyAnswer;
import org.famas.main.model.Surveys;
import org.famas.main.repo.FormRepo;
import org.famas.main.security.CustomUserDetails;
import org.jdbi.v3.core.Jdbi;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;


@Service
public class FormService {
	Jdbi jdbi;
	FormRepo repo;
	public FormService(Jdbi jdbi) {
		//super();
		this.jdbi = jdbi;
		repo= jdbi.onDemand(FormRepo.class); 
	}

	public List<Question> getDefinedSql() {
		List<Question> questions =repo.getQuestionAnswer();
		for(Question question : questions) {
			List<Answer> answers = repo.getAnswerByQid(question.getqId());
			question.setAnswer(answers);
		}
		return questions;
	}
	public Object saveQuestionAnswers(Question questionAnswer) {
		//questionRepo.save(questionAnswer);
		int q_id = repo.getMaxQuestionId() + 1;
		questionAnswer.setqId(q_id);
		repo.saveQuestion(questionAnswer);
		
		//answerRepo.save(questionAnswer.getAnswer());
		for(Answer answer:questionAnswer.getAnswer()) {
			repo.saveAnswer(answer,q_id);
			//answerRepo.save(answer);
		}
		//return null;
		return "Save Success! !!";
	}

	public void saveUserSurveyAnswer(SurveyAnswer surveyAnswer) {
		SecurityContext authentication = SecurityContextHolder.getContext();
		CustomUserDetails currentPrincipalName = (CustomUserDetails) authentication.getAuthentication().getPrincipal();
		Surveys survey = repo.findByuId(currentPrincipalName.getUser().getId());
		if(survey == null) {
			repo.createNewUserSurvey(currentPrincipalName.getUser().getId());
		}
		SurveyAnswer s = surveyAnswer;
		s.setSurvey(survey);
		repo.saveUserSurveyAnswer(s,currentPrincipalName.getUser().getId());
		//return "Save Success!!!!";
		//repo.saveSurveyAnswer()
		//return surveyAnswer;
		// survey.get().getSurveysAnswer().add(surveyAnswer);
		//surveyAnswer.setSurvey(survey.get());

		//surveyAnswerRepo.save(surveyAnswer);

		//return survey.get();
	}

	public List<Question> getResultsByUserId(int id) {
		// TODO Auto-generated method stub
		Surveys survey = repo.findByuId(id);
		List<SurveyAnswer> answers = repo.getResultsByUserId(survey.getsId());
			List<Question> questions =  repo.getQuestionAnswer();
			for(Question question : questions) {
				for(SurveyAnswer answer : answers ) {
					
					if(question.getqId() == answer.getqId()) {
						question.getAnswer().add((Answer)repo.getAnswerById(answer.getaId()));	
						if(question.getaType().equals("radio")) {
							continue;
						}
					}
				}
			}
			return questions;
			
		
	}

	public Object getAllUsers() {
		return repo.getAllUsers();
	}

	public Object generateOverallResult() {
		// TODO Auto-generated method stub
		
		List<Question> questions =  repo.getQuestionAnswer();
		for(Question question : questions) {
			question.getAnswer().add(repo.getAnswerById((int) repo.getModeAnswerByQid(question.getqId())));
		}
		return questions;
	}
	
}
