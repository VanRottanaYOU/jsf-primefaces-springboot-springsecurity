package com.gestion.etudiants.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cour")
public class Cour {
	

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="libelle")
	private Long libelle;
	
	@Column(name="semestre")
	private String semestre;
	
//	@ManyToMany
//	private List<Student> students;
	
	@ManyToOne
	private Enseignant enseignant;

	public Cour() {
		super();
	}

	public Cour(Long libelle, String semestre, Enseignant enseignant) {
		super();
		this.libelle = libelle;
		this.semestre = semestre;
		this.enseignant = enseignant;
	}

	public Long getLibelle() {
		return libelle;
	}

	public void setLibelle(Long libelle) {
		this.libelle = libelle;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

//	public List<Student> getCours() {
//		return students;
//	}
//
//	public void setCours(List<Student> students) {
//		this.students = students;
//	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cour [id=");
		builder.append(id);
		builder.append(", libelle=");
		builder.append(libelle);
		builder.append(", semestre=");
		builder.append(semestre);
//		builder.append(", students=");
//		builder.append(students);
		builder.append(", enseignant=");
		builder.append(enseignant);
		builder.append("]");
		return builder.toString();
	}

	
}
