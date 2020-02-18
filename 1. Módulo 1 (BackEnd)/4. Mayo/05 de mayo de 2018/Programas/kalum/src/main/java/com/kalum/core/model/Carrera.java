package com.kalum.core.model;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name="carrera")
public class Carrera {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo_carrera")
	private Long codigoCarera;
	@Column(name="descripcion")
	private String descripcion;
	@JsonIgnore
	@OneToMany(mappedBy="carrera", cascade = CascadeType.ALL)
	private Set<Alumno> alumnos = new HashSet<Alumno>();
	public Carrera() {
		//Null Constructor
	}
	public Carrera(Long codigoCarera, String descripcion) {
		super();
		this.codigoCarera = codigoCarera;
		this.descripcion = descripcion;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoCarera == null) ? 0 : codigoCarera.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carrera other = (Carrera) obj;
		if (codigoCarera == null) {
			if (other.codigoCarera != null)
				return false;
		} else if (!codigoCarera.equals(other.codigoCarera))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		return true;
	}
	public Long getCodigoCarera() {
		return codigoCarera;
	}
	public void setCodigoCarera(Long codigoCarera) {
		this.codigoCarera = codigoCarera;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Set<Alumno> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(Set<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
}
