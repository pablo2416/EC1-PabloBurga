package com.idat.ec1.pablo.burga.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mallas_Curricular")
public class MallaCurricular {
	
	private Integer idMalla;
	private String anio;
	
	@OneToOne
	private Universidad universidad;
		
	@OneToMany(mappedBy = "mallacurricular")
	private List<Curso> cursos = new ArrayList<>(); 
		
	public Integer getIdMalla() {
		return idMalla;
	}
	public void setIdMalla(Integer idMalla) {
		this.idMalla = idMalla;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	
	
	
	
	

}
