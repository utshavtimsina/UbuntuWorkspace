package org.famas.main.service;

import java.util.List;
import java.util.Optional;

import org.famas.main.model.Answer;
import org.famas.main.model.Question;
import org.famas.main.model.SurveyAnswer;
import org.famas.main.model.Surveys;
import org.famas.main.repo.FormRepo;
import org.jdbi.v3.core.Jdbi;
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
			List<Answer> answers = repo.getAnswerById(question.getqId());
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

	public Object saveUserSurveyAnswer(SurveyAnswer surveyAnswer) {
		Surveys survey = repo.findByuId(2);
		SurveyAnswer s = surveyAnswer;
		s.setSurvey(survey);
		repo.saveUserSurveyAnswer(s,survey.getsId());
		return "Save Success!!!!";
		//repo.saveSurveyAnswer()
		//return surveyAnswer;
		// survey.get().getSurveysAnswer().add(surveyAnswer);
		//surveyAnswer.setSurvey(survey.get());

		//surveyAnswerRepo.save(surveyAnswer);

		//return survey.get();
	}
	
}
