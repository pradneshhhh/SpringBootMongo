package com.example.SpringBootMongo.entity;

import org.springframework.data.mongodb.core.mapping.Field;

public class Department {
	
	@Field(name = "department_name")
	private String departmentName;
	
	private String location;

	public String getDepartment_name() {
		return departmentName;
	}

	public void setDepartment_name(String department_name) {
		this.departmentName = department_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
