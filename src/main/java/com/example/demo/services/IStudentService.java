package com.example.demo.services;

import com.example.demo.dtos.StudentDTO;
import com.example.demo.models.Student;
import com.example.demo.responses.StudentResonse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IStudentService {
    Student getStudentById(Long id);
    Page<StudentResonse> getStudents(Pageable pageable);
    List<Student> getStudents();
    Student saveStudent(StudentDTO studentDTO);
    Student updateStudent(Long id, StudentDTO studentDTO);
    void deleteStudent(Long id);
    List<Student> findByName(String name);
    List<Student> findByThanhPho(String name);
    List<Student> findByThanhPhoAndTen(String name);



}
