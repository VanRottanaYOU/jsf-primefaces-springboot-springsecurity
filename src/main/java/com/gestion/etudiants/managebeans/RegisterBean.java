package com.gestion.etudiants.managebeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.etudiants.model.Role;
import com.gestion.etudiants.model.User;
import com.gestion.etudiants.repository.RoleRepository;
import com.gestion.etudiants.service.UserServiceImpl;

@Named
public class RegisterBean implements Serializable{

	private String username = "";
	private String password = "";
	private User user;

	@Inject
	private UserServiceImpl userServiceImpl;

	@Inject
	private RoleRepository roleRepository;

	
	public RegisterBean() {
		super();
	}


	public void addNewUser() {

		user = new User();
		user.setPassword(password);
		user.setUsername(username);
		Set<Role> listRoles = new HashSet<Role>();
		listRoles.add(roleRepository.findByName("user"));
		user.setRoles(listRoles);
		userServiceImpl.save(user);
		
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public UserServiceImpl getUserServiceImpl() {
		return userServiceImpl;
	}


	public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}


	public RoleRepository getRoleRepository() {
		return roleRepository;
	}


	public void setRoleRepository(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}
	
	

}
