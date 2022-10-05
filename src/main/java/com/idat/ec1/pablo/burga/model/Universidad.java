package com.idat.ec1.pablo.burga.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "universidades")
public class Universidad {
	
	private Integer idUniversidad;
	private String universidad;
	
	@OneToOne
	private MallaCurricular mallaCurricular;
	
	public Integer getIsUniversidad() {
		return idUniversidad;
	}
	public void setIsUniversidad(Integer isUniversidad) {
		this.idUniversidad = isUniversidad;
	}
	public String getUniversidad() {
		return universidad;
	}
	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}
	
	

}
