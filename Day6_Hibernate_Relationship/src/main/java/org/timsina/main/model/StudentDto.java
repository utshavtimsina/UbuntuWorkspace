package org.timsina.main.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StudentDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5433447628452181223L;
	@Id
	@GeneratedValue
	private int rollNo;
	private String sName;
	private int marks;
	@OneToMany(mappedBy = "student")
	private List<LaptopDto> laptop =new ArrayList<>();
	
	public StudentDto() {
		//dsuper();
		// TODO Auto-generated constructor stub
	}

	public StudentDto(int rollNo, String sName, int marks, List<LaptopDto> laptop) {
		super();
		this.rollNo = rollNo;
		this.sName = sName;
		this.marks = marks;
		this.laptop = laptop;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public List<LaptopDto> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<LaptopDto> laptop) {
		this.laptop = laptop;
	}
	
	
	
}
