package org.famas.main.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable{
	private static final long serialVersionUID = 2135396391219434629L;
	private String idx;
	private String token;
	private int amount;
	private String mobile;
	private String product_identity;
	private String product_name;
	private String product_url;
	private String widget_id;
	
	
	
	
}
