package com.gestion.etudiants.service;

import com.gestion.etudiants.model.Student;
import com.gestion.etudiants.repository.RoleRepository;
import com.gestion.etudiants.repository.StudentRepository;
import com.gestion.etudiants.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

//@ManagedBean(name = "studentService")
//@ApplicationScoped
@Service
public class StudentServiceImpl implements StudentService {
    
	@Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }
    
    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findOne(id);
    }
    
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
    
    @Override
    public void deleteStudent(Long id) {
        studentRepository.delete(id);
    }

    @Autowired
	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
		
	}
}
