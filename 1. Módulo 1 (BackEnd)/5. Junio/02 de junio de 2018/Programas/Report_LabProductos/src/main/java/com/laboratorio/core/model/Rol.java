package com.laboratorio.core.model;

import java.io.Serializable;

import javax.persistence.Entity;
import java.util.Set;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

@Entity
@Table(name="rol")
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo_rol")
	private Long codigoRol;
	@Column(name="rol")
	private String rol;
	
	public Rol() {
		//Null Constructor
	}
	public Rol(Long codigoRol, String rol) {
		super();
		this.codigoRol = codigoRol;
		this.rol = rol;
	}
	public Long getCodigoRol() {
		return codigoRol;
	}
	public void setCodigoRol(Long codigoRol) {
		this.codigoRol = codigoRol;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoRol == null) ? 0 : codigoRol.hashCode());
		result = prime * result + ((rol == null) ? 0 : rol.hashCode());
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
		Rol other = (Rol) obj;
		if (codigoRol == null) {
			if (other.codigoRol != null)
				return false;
		} else if (!codigoRol.equals(other.codigoRol))
			return false;
		if (rol == null) {
			if (other.rol != null)
				return false;
		} else if (!rol.equals(other.rol))
			return false;
		return true;
	}
}
