package com.gestion.etudiants.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="enseignant")
public class Enseignant {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="age")
	private Long age;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
//	@ManyToMany(mappedBy="cours")
//	private List<Student> students;
//	
//	@OneToMany(mappedBy="enseignant")
//    private List<Cour> cours ;

	public Enseignant() {
		super();
	}

	public Enseignant(Long age, String nom, String prenom) {
		super();
		this.age = age;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

//	public List<Student> getStudents() {
//		return students;
//	}
//
//	public void setStudents(List<Student> students) {
//		this.students = students;
//	}
//
//	public List<Cour> getCours() {
//		return cours;
//	}
//
//	public void setCours(List<Cour> cours) {
//		this.cours = cours;
//	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Enseignant [id=");
		builder.append(id);
		builder.append(", age=");
		builder.append(age);
		builder.append(", nom=");
		builder.append(nom);
		builder.append(", prenom=");
		builder.append(prenom);
//		builder.append(", students=");
//		builder.append(students);
//		builder.append(", cours=");
//		builder.append(cours);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
