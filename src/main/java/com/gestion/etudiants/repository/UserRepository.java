package com.gestion.etudiants.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.etudiants.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
