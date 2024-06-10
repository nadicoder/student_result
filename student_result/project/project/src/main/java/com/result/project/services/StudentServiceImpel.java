package com.result.project.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.result.project.Exceptions.ResourceNotFoundException;
import com.result.project.dtos.StudentDto;
import com.result.project.entities.Student;
import com.result.project.repositories.StudentRepository;

@Service
public class StudentServiceImpel implements StudentService {
	
	
	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private ModelMapper mapper;
	
	private Logger logger=LoggerFactory.getLogger(StudentServiceImpel.class);
	@Override
	public StudentDto create(StudentDto studentDto) {
		// TODO Auto-generated method stub
		
		logger.info("created object "+studentDto);
		Student student=mapper.map(studentDto, Student.class);
		Student student_res=studentRepository.save(student);
		
		return mapper.map(student, StudentDto.class);
	}
	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		Student student;
		
			try {
				student = studentRepository.findById(id).orElseThrow(()->new ResourceNotFoundException());
				studentRepository.delete(student);
			} catch (ResourceNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		return "id got deleted";
	}
	@Override
	public List<StudentDto> getAll() {
		// TODO Auto-generated method stub
		List<Student> li=studentRepository.findAll();
		
		List<StudentDto> sdto= li.stream()
				.map(i->mapper.map(i, StudentDto.class))
				.collect(Collectors.toList());
		
		return sdto;
	}
	@Override
	public StudentDto update(int id, StudentDto studentDto) {
		// TODO Auto-generated method stub
		try {
			Student student=studentRepository.findById(id).orElseThrow(()->new ResourceNotFoundException());
			student.setS_name(studentDto.getS_name());
			student.setS_department(studentDto.getS_department());
			student.setS_location(studentDto.getS_location());
			Student studentr=studentRepository.save(student);
			return mapper.map(studentr, StudentDto.class);
			
		} catch (ResourceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}
	@Override
	public StudentDto getBySingle(int id) {
		// TODO Auto-generated method stub
		Student student = null;
		try {
			student = studentRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("kanabadutaledu"));
			return mapper.map(student, StudentDto.class);
		}
		 catch (ResourceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return mapper.map(student, StudentDto.class);
		}
		}
		
	

}
