package org.famas.main.mapper;

import java.util.List;



public class QuestionAnswerSaveMapper {
	private String question;
	private String radio;
	private List<String> answers;
	private List<String> questions;
	
	public QuestionAnswerSaveMapper(String question, String radio, List<String> answers, List<String> questions) {
		this.question = question;
		this.radio = radio;
		this.answers = answers;
		this.questions = questions;
	}

	public QuestionAnswerSaveMapper() {
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getRadio() {
		return radio;
	}

	public void setRadio(String radio) {
		this.radio = radio;
	}

	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

	public List<String> getQuestions() {
		return questions;
	}

	public void setQuestions(List<String> questions) {
		this.questions = questions;
	}
	
}
