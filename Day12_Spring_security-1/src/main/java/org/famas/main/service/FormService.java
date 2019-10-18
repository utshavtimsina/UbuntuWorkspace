package org.famas.main.service;

import java.util.List;

import org.famas.main.model.Answer;
import org.famas.main.model.Question;
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
	
}
