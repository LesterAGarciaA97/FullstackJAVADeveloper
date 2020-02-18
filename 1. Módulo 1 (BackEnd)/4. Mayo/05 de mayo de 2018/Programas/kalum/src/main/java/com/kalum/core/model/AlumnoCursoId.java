package com.kalum.core.model;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Column;
@Embeddable
public class AlumnoCursoId implements Serializable {
	@Column(name="codigo_alumno",nullable=false,insertable=false,updatable=false)
	private Long codigoAlumno;
	@Column(name="codigo_curso",nullable=false,insertable=false,updatable=false)
	private Long codigoCurso;
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
	public AlumnoCursoId() {
		// TODO Auto-generated constructor stub
	}
	public AlumnoCursoId(Long codigoAlumno, Long codigoCurso) {
		super();
		this.codigoAlumno = codigoAlumno;
		this.codigoCurso = codigoCurso;
	}
	
}
