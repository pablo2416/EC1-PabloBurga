package com.idat.ec1.pablo.burga.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "profesores")
public class Profesor {
	
	private Integer idProfesor;
	private String profesor;
	
	@ManyToMany
	@JoinTable(name = "profesor_curso",
	joinColumns = @JoinColumn(name = "id_profesor", nullable = false, unique = true, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign Key (id_profesor) references profesores (id_Profesor)")),
	inverseJoinColumns = @JoinColumn(name = "id_curso", nullable = false, unique = true, foreignKey = @ForeignKey(foreignKeyDefinition = "foreing Key (id_curso) references cursos (id_Curso)" ))
	       )
	private List<Curso> cursos = new ArrayList<>();
	
	public Integer getIdProfesor() {
		return idProfesor;
	}
	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	
	

}
