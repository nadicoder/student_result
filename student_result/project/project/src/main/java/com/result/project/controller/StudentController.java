package com.result.project.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.result.project.dtos.StudentDto;
import com.result.project.helper.ApiResponseMessage;
import com.result.project.services.StudentService;

@RestController
@RequestMapping("/result/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	private Logger logger=LoggerFactory.getLogger(StudentController.class);

	
	
	@PostMapping("/create")
	public ResponseEntity<StudentDto> create(@RequestBody StudentDto studentDto)
	{
		
		logger.info("here  "+studentDto);
		
		StudentDto studentDto_res=studentService.create(studentDto);
		
		return new ResponseEntity(studentDto_res,HttpStatus.CREATED);
	}
	
	
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ApiResponseMessage> delete(@PathVariable("id") int id)
	{
		String s=studentService.delete(id);
		ApiResponseMessage apis=new ApiResponseMessage();
		apis.setMessage("record got deleted");
		apis.setStatus(HttpStatus.OK);
		apis.setSuccess(true);
		
		return new ResponseEntity(apis,HttpStatus.OK);
	}
	
	
	
	
	@GetMapping()
	public ResponseEntity<List<StudentDto>> getAll()
	{
		List<StudentDto> studentDtos=studentService.getAll();
		return new ResponseEntity(studentDtos,HttpStatus.OK);
	}
	
	
	
	@PutMapping("/{id}")
	public ResponseEntity<StudentDto> update(@RequestBody StudentDto studentDto,
			@PathVariable("id") int id)
	{
		StudentDto result_dto=studentService.update(id, studentDto);
		
		return new ResponseEntity(result_dto,HttpStatus.OK);
	}
	
	
	@GetMapping("/single/{id}")
	public ResponseEntity<StudentDto> getBySingle(@PathVariable("id") int id)
	{
		StudentDto studentDto=studentService.getBySingle(id);
	
	return new ResponseEntity(studentDto,HttpStatus.OK);
	}
}
