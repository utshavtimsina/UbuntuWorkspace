package org.timsina.main.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class SurveyAnswer {
	// private static final long serialVersionUID = 1L;
	@Id

	@GeneratedValue
	private int id;
	private int aId;
	private int qId;
	private String remarks;

	@ManyToOne
	@JsonIgnore
	// @JsonBackReference
	private Surveys survey;

	public SurveyAnswer() {
		// super();
		// TODO Auto-generated constructor stub
	}

	public SurveyAnswer(int id, int aId, int qId, String remarks, Surveys survey) {
		// super();
		this.id = id;
		this.aId = aId;
		this.qId = qId;
		this.remarks = remarks;
		this.survey = survey;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public int getqId() {
		return qId;
	}

	public void setqId(int qId) {
		this.qId = qId;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Surveys getSurvey() {
		return survey;
	}

	public void setSurvey(Surveys survey) {
		this.survey = survey;
	}

}
