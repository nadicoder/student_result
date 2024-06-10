package com.result.project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {

	@Id
	@Column(name="Student_id")
	private int s_id;
	@Column(name="student_name")
	private String s_name;
	@Column(name="Student_department")
	private String s_department;
	@Column(name="Student_location")
	private String s_location;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int s_id, String s_name, String s_department, String s_location) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_department = s_department;
		this.s_location = s_location;
	}
	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", s_department=" + s_department + ", s_location="
				+ s_location + "]";
	}
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
	
}