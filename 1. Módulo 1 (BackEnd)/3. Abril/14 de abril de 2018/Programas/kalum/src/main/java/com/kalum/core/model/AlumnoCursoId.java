package com.kalum.core.model;
import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.Column;
@Embeddable
public class AlumnoCursoId implements Serializable {
	@Column(name="codigo_alumno",nullable=false,insertable=false,updatable=false)
	private Long codigoAlumno;
	@Column(name="codigo_curso",nullable=false,insertable=false,updatable=false)
	private Long codigoCurso;
	
	public AlumnoCursoId(Long codigoAlumno, Long codigoCurso) {
		super();
		this.codigoAlumno = codigoAlumno;
		this.codigoCurso = codigoCurso;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoAlumno == null) ? 0 : codigoAlumno.hashCode());
		result = prime * result + ((codigoCurso == null) ? 0 : codigoCurso.hashCode());
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
		AlumnoCursoId other = (AlumnoCursoId) obj;
		if (codigoAlumno == null) {
			if (other.codigoAlumno != null)
				return false;
		} else if (!codigoAlumno.equals(other.codigoAlumno))
			return false;
		if (codigoCurso == null) {
			if (other.codigoCurso != null)
				return false;
		} else if (!codigoCurso.equals(other.codigoCurso))
			return false;
		return true;
	}
	public Long getCodigoAlumno() {
		return codigoAlumno;
	}
	public void setCodigoAlumno(Long codigoAlumno) {
		this.codigoAlumno = codigoAlumno;
	}
	public Long getCodigoCurso() {
		return codigoCurso;
	}
	public void setCodigoCurso(Long codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
}
