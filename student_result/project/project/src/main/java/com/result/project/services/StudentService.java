package com.result.project.services;

import java.util.List;

import com.result.project.dtos.StudentDto;

public interface StudentService {
	
	
	//create
	public StudentDto create(StudentDto studentDto);
	
	//update
	
	public StudentDto update(int id,StudentDto studentDto);
	
	
	//delete
	
	public String delete(int id);
	//view all
	
	public List<StudentDto> getAll();
	
	//get single
	public StudentDto getBySingle(int id);

}
