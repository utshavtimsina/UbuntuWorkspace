package org.timsina.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.timsina.main.model.SurveyAnswer;
import org.timsina.main.model.Surveys;
import org.timsina.main.repository.SurveysAnswerRepository;
import org.timsina.main.repository.SurveysRepository;

@Service
public class SurveyAnswerService {

	@Autowired
	SurveysRepository surveyRepo;
	@Autowired
	SurveysAnswerRepository surveyAnswerRepo;

	public SurveyAnswerService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Iterable<Surveys> getAllSurveyResult() {
		return surveyRepo.findAll();

	}

	public Object saveUserSurveyAnswer(SurveyAnswer surveyAnswer) {
		Optional<Surveys> survey = surveyRepo.findByuId(2);
		// survey.get().getSurveysAnswer().add(surveyAnswer);
		surveyAnswer.setSurvey(survey.get());

		surveyAnswerRepo.save(surveyAnswer);

		return survey.get();
	}
}
