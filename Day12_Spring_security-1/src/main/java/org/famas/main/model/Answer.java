package org.famas.main.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Answer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8392151882671990688L;

	private int aId;
	private int subQuestionId;
	private String aName;
	private String aDescription;
	private int question_q_id;


	
}
