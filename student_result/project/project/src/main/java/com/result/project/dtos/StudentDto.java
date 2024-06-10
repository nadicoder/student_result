package com.result.project.dtos;

import jakarta.persistence.Column;

public class StudentDto {
	
	private int s_id;

	private String s_name;

	private String s_department;
	
	private String s_location;

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_department() {
		return s_department;
	}

	public void setS_department(String s_department) {
		this.s_department = s_department;
	}

	public String getS_location() {
		return s_location;
	}

	public void setS_location(String s_location) {
		this.s_location = s_location;
	}

	public StudentDto(int s_id, String s_name, String s_department, String s_location) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_department = s_department;
		this.s_location = s_location;
	}

	@Override
	public String toString() {
		return "StudentDto [s_id=" + s_id + ", s_name=" + s_name + ", s_department=" + s_department + ", s_location="
				+ s_location + "]";
	}

	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
