package org.famas.main.service;

import java.util.List;
import java.util.Optional;

import org.famas.main.model.Answer;
import org.famas.main.model.Question;
import org.famas.main.model.SubQuestion;
import org.famas.main.model.SurveyAnswer;
import org.famas.main.model.Surveys;
import org.famas.main.model.UserDto;
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
		// super();
		this.jdbi = jdbi;
		repo = jdbi.onDemand(FormRepo.class);
	}

	public List<Question> getDefinedSql() {
		List<Question> questions = repo.getQuestionAnswer();
		for (Question question : questions) {
			if (question.getaType().equals("multiple")) {
				for (SubQuestion subquestion : repo.getSubQuestionByQid(question.getqId())) {
					subquestion.setAnswer(repo.getSubAnswerBySubQuestionId(subquestion.getId(), question.getqId()));
					question.getSubQuestion().add(subquestion);
					// question.getSubQuestion().getClass().
				}
			} else {
				question.setAnswer(repo.getAnswerByQid(question.getqId()));
			}
		}
		return questions;
	}

	public Object saveQuestionAnswers(Question questionAnswer) {
		// questionRepo.save(questionAnswer);
		int q_id = repo.getMaxQuestionId() + 1;
		questionAnswer.setqId(q_id);
		repo.saveQuestion(questionAnswer);

		// answerRepo.save(questionAnswer.getAnswer());
		for (Answer answer : questionAnswer.getAnswer()) {
			repo.saveAnswer(answer, q_id);
			// answerRepo.save(answer);
		}
		// return null;
		return "Save Success! !!";
	}

	public Object saveUserSurveyAnswer(SurveyAnswer surveyAnswer) {
		SecurityContext authentication = SecurityContextHolder.getContext();
		CustomUserDetails currentPrincipalName = (CustomUserDetails) authentication.getAuthentication().getPrincipal();
		Surveys survey = repo.findByuId(currentPrincipalName.getUser().getId());
		if (survey == null) {
			repo.createNewUserSurvey(currentPrincipalName.getUser().getId());
		}
		surveyAnswer.setSurvey(survey);
		repo.saveUserSurveyAnswer(surveyAnswer, currentPrincipalName.getUser().getId());
		// return "Save Success!!!!";
		// repo.saveSurveyAnswer() //return surveyAnswer;
		// survey.get().getSurveysAnswer().add(surveyAnswer);
		// surveyAnswer.setSurvey(survey.get());

		// surveyAnswerRepo.save(surveyAnswer);

		return surveyAnswer;
	}

	public Object getResultsByUserId(int id) {
		// TODO Auto-generated method stub
		Surveys survey = repo.findByuId(id);
		List<SurveyAnswer> surveyAnswers = repo.getResultsByUserId(survey.getsId());
		///*
		List<Question> questions = repo.getQuestionAnswer();
		for (Question question : questions) {
			if (question.getaType().equals("multiple")) {
				List<SubQuestion> subquestion = repo.getSubQuestionByQid(question.getqId());
				for (SubQuestion q : subquestion) {
					for (SurveyAnswer surveyResult : surveyAnswers) {
						if (surveyResult.getSubQuestionId() == q.getId() && surveyResult.getqId() == q.getQId()) {
							q.getAnswer().add(repo.getAnswerById(surveyResult.getaId()));
						}
					}
				}
				question.setSubQuestion(subquestion);
			}else {
				for (SurveyAnswer surveyResult : surveyAnswers) {
					if (surveyResult.getqId() == question.getqId()) {
						question.getAnswer().add(repo.getAnswerById(surveyResult.getaId()));
					}
				}
			}
		}

		return questions;
		// */
		// return surveyAnswers;

	}

	public Object getAllUsers() {
		return repo.getAllUsers();
	}

	public Object generateOverallResult() {
		// TODO Auto-generated method stub

		List<Question> questions = repo.getQuestionAnswer();
		for (Question question : questions) {
			question.getAnswer().add(repo.getAnswerById((int) repo.getModeAnswerByQid(question.getqId())));
		}
		return questions;
	}

	public UserDto getUserById(int id) {
		// TODO Auto-generated method stub
		return repo.getUserById(id);
	}

}
