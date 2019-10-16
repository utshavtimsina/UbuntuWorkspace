package com.example.demo.model;

public class Feedback {

	/*
	 * private int dayVisited; private int monthVisited; private int yearVisited;
	 */
	private String q19_dineIn;
	private String q7_foodQuality;
	private String q8_overallService;
	private String q10_cleanliness;
	private String q11_orderAccuracy;
	private String q12_speedOf;
	private String q13_value;
	private String q14_overallExperience;
	private String q9_anyComments;
	private String q2_nameoptional;
	private String q20_age;
	private String q4_emailoptional;

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Feedback(String q19_dineIn, String q7_foodQuality, String q8_overallService, String q10_cleanliness,
			String q11_orderAccuracy, String q12_speedOf, String q13_value, String q14_overallExperience,
			String q9_anyComments, String q2_nameoptional, String q20_age, String q4_emailoptional) {
		super();
		this.q19_dineIn = q19_dineIn;
		this.q7_foodQuality = q7_foodQuality;
		this.q8_overallService = q8_overallService;
		this.q10_cleanliness = q10_cleanliness;
		this.q11_orderAccuracy = q11_orderAccuracy;
		this.q12_speedOf = q12_speedOf;
		this.q13_value = q13_value;
		this.q14_overallExperience = q14_overallExperience;
		this.q9_anyComments = q9_anyComments;
		this.q2_nameoptional = q2_nameoptional;
		this.q20_age = q20_age;
		this.q4_emailoptional = q4_emailoptional;
	}

	public String getQ19_dineIn() {
		return q19_dineIn;
	}

	public void setQ19_dineIn(String q19_dineIn) {
		this.q19_dineIn = q19_dineIn;
	}

	public String getQ7_foodQuality() {
		return q7_foodQuality;
	}

	public void setQ7_foodQuality(String q7_foodQuality) {
		this.q7_foodQuality = q7_foodQuality;
	}

	public String getQ8_overallService() {
		return q8_overallService;
	}

	public void setQ8_overallService(String q8_overallService) {
		this.q8_overallService = q8_overallService;
	}

	public String getQ10_cleanliness() {
		return q10_cleanliness;
	}

	public void setQ10_cleanliness(String q10_cleanliness) {
		this.q10_cleanliness = q10_cleanliness;
	}

	public String getQ11_orderAccuracy() {
		return q11_orderAccuracy;
	}

	public void setQ11_orderAccuracy(String q11_orderAccuracy) {
		this.q11_orderAccuracy = q11_orderAccuracy;
	}

	public String getQ12_speedOf() {
		return q12_speedOf;
	}

	public void setQ12_speedOf(String q12_speedOf) {
		this.q12_speedOf = q12_speedOf;
	}

	public String getQ13_value() {
		return q13_value;
	}

	public void setQ13_value(String q13_value) {
		this.q13_value = q13_value;
	}

	public String getQ14_overallExperience() {
		return q14_overallExperience;
	}

	public void setQ14_overallExperience(String q14_overallExperience) {
		this.q14_overallExperience = q14_overallExperience;
	}

	public String getQ9_anyComments() {
		return q9_anyComments;
	}

	public void setQ9_anyComments(String q9_anyComments) {
		this.q9_anyComments = q9_anyComments;
	}

	public String getQ2_nameoptional() {
		return q2_nameoptional;
	}

	public void setQ2_nameoptional(String q2_nameoptional) {
		this.q2_nameoptional = q2_nameoptional;
	}

	public String getQ20_age() {
		return q20_age;
	}

	public void setQ20_age(String q20_age) {
		this.q20_age = q20_age;
	}

	public String getQ4_emailoptional() {
		return q4_emailoptional;
	}

	public void setQ4_emailoptional(String q4_emailoptional) {
		this.q4_emailoptional = q4_emailoptional;
	}

	@Override
	public String toString() {
		return "Feedback [q19_dineIn=" + q19_dineIn + ", q7_foodQuality=" + q7_foodQuality + ", q8_overallService="
				+ q8_overallService + ", q10_cleanliness=" + q10_cleanliness + ", q11_orderAccuracy="
				+ q11_orderAccuracy + ", q12_speedOf=" + q12_speedOf + ", q13_value=" + q13_value
				+ ", q14_overallExperience=" + q14_overallExperience + ", q9_anyComments=" + q9_anyComments
				+ ", q2_nameoptional=" + q2_nameoptional + ", q20_age=" + q20_age + ", q4_emailoptional="
				+ q4_emailoptional + "]";
	}

}
