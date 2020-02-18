package com.kalum.core.model;
import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.Column;

@Embeddable
public class ProfesorCursoId implements Serializable {
	@Column(name="codigo_profesor",nullable=false,insertable=false,updatable=false)
	private Long codigoProfesor;
	@Column(name="codigo_curso",nullable=false,insertable=false,updatable=false)
	private Long codigoCurso;
	
	public ProfesorCursoId() {
		//Null constructor
	}
	public ProfesorCursoId(Long codigoProfesor, Long codigoCurso) {
		super();
		this.codigoProfesor = codigoProfesor;
		this.codigoCurso = codigoCurso;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoCurso == null) ? 0 : codigoCurso.hashCode());
		result = prime * result + ((codigoProfesor == null) ? 0 : codigoProfesor.hashCode());
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
		ProfesorCursoId other = (ProfesorCursoId) obj;
		if (codigoCurso == null) {
			if (other.codigoCurso != null)
				return false;
		} else if (!codigoCurso.equals(other.codigoCurso))
			return false;
		if (codigoProfesor == null) {
			if (other.codigoProfesor != null)
				return false;
		} else if (!codigoProfesor.equals(other.codigoProfesor))
			return false;
		return true;
	}
	public Long getCodigoProfesor() {
		return codigoProfesor;
	}
	public void setCodigoProfesor(Long codigoProfesor) {
		this.codigoProfesor = codigoProfesor;
	}
	public Long getCodigoCurso() {
		return codigoCurso;
	}
	public void setCodigoCurso(Long codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
}
