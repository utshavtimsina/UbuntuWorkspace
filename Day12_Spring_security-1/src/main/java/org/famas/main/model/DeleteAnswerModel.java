package org.famas.main.model;

import java.util.List;

public class DeleteAnswerModel{
    private List<Integer> question;
    private List<Integer> answer;
    private List<Integer> subquestion;

    public DeleteAnswerModel() {
    }

    public DeleteAnswerModel(List<Integer> question, List<Integer> answer, List<Integer> subquestion) {
        this.question = question;
        this.answer = answer;
        this.subquestion = subquestion;
    }

    public List<Integer> getQuestion() {
        return question;
    }

    public void setQuestion(List<Integer> question) {
        this.question = question;
    }

    public List<Integer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Integer> answer) {
        this.answer = answer;
    }

    public List<Integer> getSubquestion() {
        return subquestion;
    }

    public void setSubquestion(List<Integer> subquestion) {
        this.subquestion = subquestion;
    }

    

}