package com.gestion.etudiants.test.repositories;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.gestion.etudiants.repository.StudentRepository;
 
public class MockBDDTest {
	
    @Mock
    private StudentRepository studentRepository;
    
   
    
    @Before
    public void setupMock() {
       MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void testMockCreation(){
    	System.out.println("Students : " + studentRepository.findAll());
        assertNotNull(studentRepository.findAll());
    }
}
