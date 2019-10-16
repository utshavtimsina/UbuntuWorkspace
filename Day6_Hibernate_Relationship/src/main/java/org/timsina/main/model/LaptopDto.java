package org.timsina.main.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class LaptopDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -976083736115224508L;
	@Id
	@GeneratedValue
	private int lId;
	private String lName;
	@ManyToOne
	@JsonIgnore
	private StudentDto student;
	
	public LaptopDto() {
	//	super();
		// TODO Auto-generated constructor stub
	}

	public LaptopDto(int lId, String lName, StudentDto student) {
		super();
		this.lId = lId;
		this.lName = lName;
		this.student = student;
	}

	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}
		
	
}
