package com.kalum.core.model;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.EmbeddedId;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
@Table(name="profesor_curso")
public class ProfesorCurso implements Serializable{
	@EmbeddedId
	private ProfesorCursoId profesorCursoId;
	@Column(name="fecha_asignacion")
	private Date fechaAsignacion;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="codigo_profesor",referencedColumnName="codigo_profesor", nullable=false,insertable=false,updatable=false)
	private Profesor profesor;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="codigo_curso",referencedColumnName="codigo_curso", nullable=false,insertable=false,updatable=false)
	private Curso curso;
	
	public ProfesorCurso() {
		//Null constructor
	}
	public ProfesorCurso(ProfesorCursoId profesorCursoId, Date fechaAsignacion, Profesor profesor, Curso curso) {
		super();
		this.profesorCursoId = profesorCursoId;
		this.fechaAsignacion = fechaAsignacion;
		this.profesor = profesor;
		this.curso = curso;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		result = prime * result + ((fechaAsignacion == null) ? 0 : fechaAsignacion.hashCode());
		result = prime * result + ((profesor == null) ? 0 : profesor.hashCode());
		result = prime * result + ((profesorCursoId == null) ? 0 : profesorCursoId.hashCode());
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
		ProfesorCurso other = (ProfesorCurso) obj;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (fechaAsignacion == null) {
			if (other.fechaAsignacion != null)
				return false;
		} else if (!fechaAsignacion.equals(other.fechaAsignacion))
			return false;
		if (profesor == null) {
			if (other.profesor != null)
				return false;
		} else if (!profesor.equals(other.profesor))
			return false;
		if (profesorCursoId == null) {
			if (other.profesorCursoId != null)
				return false;
		} else if (!profesorCursoId.equals(other.profesorCursoId))
			return false;
		return true;
	}
	public ProfesorCursoId getProfesorCursoId() {
		return profesorCursoId;
	}
	public void setProfesorCursoId(ProfesorCursoId profesorCursoId) {
		this.profesorCursoId = profesorCursoId;
	}
	public Date getFechaAsignacion() {
		return fechaAsignacion;
	}
	public void setFechaAsignacion(Date fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
