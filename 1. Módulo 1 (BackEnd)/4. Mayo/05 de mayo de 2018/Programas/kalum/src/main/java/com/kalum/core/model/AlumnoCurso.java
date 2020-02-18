package com.kalum.core.model;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.EmbeddedId;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
@Entity
@Table(name="alumno_curso")
public class AlumnoCurso implements Serializable {
	@EmbeddedId
	private AlumnoCursoId alumnoCursoId;
	@Column(name="fecha_asignacion")
	private Date fechaAsignacion;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="codigo_alumno",referencedColumnName="codigo_alumno",nullable=false,insertable=false,updatable=false)
	private Alumno alumno;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="codigo_curso",referencedColumnName="codigo_curso",nullable=false,insertable=false,updatable=false)
	private Curso curso;
	
	public AlumnoCurso() {
		//Null Constructor
	}
	public AlumnoCurso(AlumnoCursoId alumnoCursoId, Date fechaAsignacion) {
		super();
		this.alumnoCursoId = alumnoCursoId;
		this.fechaAsignacion = fechaAsignacion;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alumnoCursoId == null) ? 0 : alumnoCursoId.hashCode());
		result = prime * result + ((fechaAsignacion == null) ? 0 : fechaAsignacion.hashCode());
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
		AlumnoCurso other = (AlumnoCurso) obj;
		if (alumnoCursoId == null) {
			if (other.alumnoCursoId != null)
				return false;
		} else if (!alumnoCursoId.equals(other.alumnoCursoId))
			return false;
		if (fechaAsignacion == null) {
			if (other.fechaAsignacion != null)
				return false;
		} else if (!fechaAsignacion.equals(other.fechaAsignacion))
			return false;
		return true;
	}
	public AlumnoCursoId getAlumnoCursoId() {
		return alumnoCursoId;
	}
	public void setAlumnoCursoId(AlumnoCursoId alumnoCursoId) {
		this.alumnoCursoId = alumnoCursoId;
	}
	public Date getFechaAsignacion() {
		return fechaAsignacion;
	}
	public void setFechaAsignacion(Date fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}
}
