package com.gestion.etudiants.managebeans;

import org.primefaces.event.SelectEvent;
import org.primefaces.model.LazyDataModel;
import org.springframework.beans.factory.annotation.Autowired;

import com.gestion.etudiants.datamodel.StudentLazyDataModel;
import com.gestion.etudiants.model.Student;
import com.gestion.etudiants.repository.StudentRepository;
import com.gestion.etudiants.service.StudentService;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@ViewScoped
public class DtLazyViewStudent implements Serializable {
    
    private LazyDataModel<Student> lazyModelStudent;
     
    private Student selectedStudent;
    
//    @Inject
//    private StudentService studentService;
    
    @Inject
    private StudentRepository studentRepository;
    
    @PostConstruct
    public void init() {
    	//lazyModelStudent = new StudentLazyDataModel(studentService.findAll());
    	lazyModelStudent = new StudentLazyDataModel(studentRepository.findAll());
    }
 
    public LazyDataModel<Student> getLazyModel() {
        return lazyModelStudent;
    }
 
    public Student getSelectedStudent() {
        return selectedStudent;
    }
 
    public void setSelectedStudent(Student selectedStudent) {
		this.selectedStudent = selectedStudent;
	}

	public void setselectedStudent(Student selectedStudent) {
        this.selectedStudent = selectedStudent;
    }
    
     
    public void onRowSelect(SelectEvent event) {
        FacesMessage msg = new FacesMessage("Student Selected");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

	public LazyDataModel<Student> getLazyModelStudent() {
		return lazyModelStudent;
	}

	public void setLazyModelStudent(LazyDataModel<Student> lazyModelStudent) {
		this.lazyModelStudent = lazyModelStudent;
	}

//	public StudentService getStudentService() {
//		return studentService;
//	}
//
//	public void setStudentService(StudentService studentService) {
//		this.studentService = studentService;
//	}

    
}

