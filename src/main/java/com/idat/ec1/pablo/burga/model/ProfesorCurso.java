package com.idat.ec1.pablo.burga.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "profesor_curso")
public class ProfesorCurso {
	
	private ProfesorCursoFK fk = new ProfesorCursoFK();

}

@Embeddable
class ProfesorCursoFK implements Serializable{
	
	@Column(name = "id_profesor", nullable = false, unique = true)
	private Integer idProfesor;
	
	@Column(name = "id_curso", nullable = false, unique = true)
	private Integer idCurso;

	public Integer getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}

	public Integer getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}
	
	
	
	
}