package com.gestion.etudiants.service;
import com.gestion.etudiants.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}

