package com.gestion.etudiants.test.repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gestion.etudiants.model.Student;
import com.gestion.etudiants.repository.StudentRepository;
import com.gestion.etudiants.test.configuration.RepositoryConfiguration;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {RepositoryConfiguration.class})
public class StudentRepositoryTest {
	
	@Autowired
    private StudentRepository studentRepository;
    
    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @Test
    public void testSaveStudent(){
        //setup product
    	Student student = new Student();
    	student.setAge(75L);
    	student.setNom("John");
        //save product, verify has ID value after save
        assertNull(student.getId()); //null before save
        studentRepository.save(student);
        assertNotNull(student.getId()); //not null after save
        //fetch from DB
        List<Student> fetchedStudent = studentRepository.findAll();
        //should not be null
        System.out.println(fetchedStudent);
        assertNotNull(fetchedStudent);
        //should equal
       
    }
}
