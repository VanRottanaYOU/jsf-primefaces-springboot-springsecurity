package com.gestion.etudiants.service;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
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

import com.gestion.etudiants.model.Role;
import com.gestion.etudiants.model.Student;
import com.gestion.etudiants.model.User;
import com.gestion.etudiants.repository.RoleRepository;
import com.gestion.etudiants.repository.StudentRepository;
import com.gestion.etudiants.utils.HibernateUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@ManagedBean(name = "registerService")
@ApplicationScoped
@Service
public class RegisterService {
  
	@PersistenceContext
    private EntityManager entityManager;
	
	private String username;
	private String password;
	private User user;
	
	@Inject
	private UserServiceImpl userServiceImpl;

	@Inject
	private RoleRepository roleRepository;

    
    public void addNewUser(){
    	
    	user.setPassword(password);
		user.setUsername(username);
		Set<Role> listRoles = new HashSet<Role>();
		listRoles.add(roleRepository.findByName("user"));
		user.setRoles(listRoles);
		userServiceImpl.save(user);
    }
    
}