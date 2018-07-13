package com.gestion.etudiants.test.services;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import com.gestion.etudiants.model.Student;
import com.gestion.etudiants.repository.StudentRepository;
import com.gestion.etudiants.service.StudentServiceImpl;

import static org.mockito.Mockito.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;



public class StudentServiceImplMockTest {

	
    private StudentServiceImpl studentServiceImpl;

	@Mock
    private StudentRepository studentRepository;
	
    @Mock
    private Student student;
    
    @Before
    public void setupMock() {
        MockitoAnnotations.initMocks(this);
        studentServiceImpl=new StudentServiceImpl();
        studentServiceImpl.setStudentRepository(studentRepository);
    }
    
    @Test
    public void shouldReturnStudent_whenGetStudentByIdIsCalled() throws Exception {
        // Arrange
        when(studentRepository.findOne(1L)).thenReturn(student);
        // Act
        Student monstudent = studentServiceImpl.getStudentById(1L);
        // Assert
        assertThat(monstudent, is(equalTo(student)));

    }
    
    @Test
    public void shouldReturnStudent_whenSaveStudentIsCalled() throws Exception {
        // Arrange
        when(studentRepository.save(student)).thenReturn(student);
        // Act
        Student savedStudent = studentServiceImpl.saveStudent(student);
        // Assert
        assertThat(savedStudent, is(equalTo(student)));
    }
    
    @Test
    public void shouldCallDeleteMethodOfStudentRepository_whenDeleteStudentIsCalled() throws Exception {
        // Arrange
        doNothing().when(studentRepository).delete(5L);
        StudentRepository my = Mockito.mock(StudentRepository.class);
        // Act
        studentServiceImpl.deleteStudent(5L);
        // Assert
        verify(studentRepository, times(1)).delete(5L);
    }
}