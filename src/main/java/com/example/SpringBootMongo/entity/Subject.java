package com.example.SpringBootMongo.entity;

import org.springframework.data.mongodb.core.mapping.Field;

public class Subject {
	
	@Field(name = "subject_name")
	private String subjectName;
	
	@Field(name = "marks_obtained")
	private String marksObtained;

	public String getSubject() {
		return subjectName;
	}

	public void setSubject(String subject) {
		this.subjectName = subject;
	}

	public String getMarks_obtained() {
		return marksObtained;
	}

	public void setMarks_obtained(String marks_obtained) {
		this.marksObtained = marks_obtained;
	}
;
}
