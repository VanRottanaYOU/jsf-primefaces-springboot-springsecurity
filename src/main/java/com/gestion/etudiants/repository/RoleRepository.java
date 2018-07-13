package com.gestion.etudiants.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.etudiants.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

	Role findByName(String string);
	
}
