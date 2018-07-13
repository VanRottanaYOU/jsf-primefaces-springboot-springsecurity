package com.gestion.etudiants.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.etudiants.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
