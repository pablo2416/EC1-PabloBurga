package com.idat.ec1.pablo.burga.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cursos")
public class Curso {
	
	private Integer idCurso;
	private String curso;
	private String description;
	
	@ManyToMany(mappedBy = "cursos")     
	private List<Profesor> profesores = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="id_Malla", nullable = false, unique = true, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign Kei (id_malla)references mallas_curriculares(id_malla)"))
	private MallaCurricular mallacurricular;
	
	public Integer getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
