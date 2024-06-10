package com.result.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.result.project.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
