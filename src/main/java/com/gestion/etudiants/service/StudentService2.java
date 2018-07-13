package com.gestion.etudiants.service;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.etudiants.model.Student;
import com.gestion.etudiants.repository.StudentRepository;
import com.gestion.etudiants.utils.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "studentService")
@ApplicationScoped
@Service
public class StudentService2 {
  
	@PersistenceContext
    private EntityManager entityManager;
    
    public List<Student> getStudentsList(){
    	
    	TypedQuery<Student> query =
    			entityManager.createQuery("SELECT c FROM Student c", Student.class);
    		  List<Student> students = query.getResultList();
    	
   		return students;
    }
    
}