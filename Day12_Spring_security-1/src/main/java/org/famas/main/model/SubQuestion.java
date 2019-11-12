package org.famas.main.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubQuestion {
	
	private int id;
	private String qDescription;
	private int qId;
	private List<Answer> answer = new ArrayList<>(); 
	
	
}
