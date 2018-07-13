package com.gestion.etudiants.service;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.gestion.etudiants.model.Student;


public interface StudentService {

    List<Student> findAll();
    
    Student getStudentById(Long id);
    
    Student saveStudent(Student student);
    
    void deleteStudent(Long id);
}

