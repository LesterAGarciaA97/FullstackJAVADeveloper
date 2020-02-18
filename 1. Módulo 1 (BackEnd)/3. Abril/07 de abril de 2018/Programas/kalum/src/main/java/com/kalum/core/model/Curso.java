package com.kalum.core.model;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.OneToMany;
@Entity
@Table(name="curso")
public class Curso implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="codigo_curso")
	private Long codigoCurso;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="numero_alumno")
	private int numeroAlumnos;
	@OneToMany(mappedBy="curso",fetch=FetchType.EAGER)
	private Set<AlumnoCurso> AlumnoCurso;
	public Curso() {
		//Null Constructor
	}
	public Curso(Long codigoCurso, String descripcion, int numeroAlumnos) {
		super();
		this.codigoCurso = codigoCurso;
		this.descripcion = descripcion;
		this.numeroAlumnos = numeroAlumnos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoCurso == null) ? 0 : codigoCurso.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + numeroAlumnos;
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
		Curso other = (Curso) obj;
		if (codigoCurso == null) {
			if (other.codigoCurso != null)
				return false;
		} else if (!codigoCurso.equals(other.codigoCurso))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (numeroAlumnos != other.numeroAlumnos)
			return false;
		return true;
	}
	public Long getCodigoCurso() {
		return codigoCurso;
	}
	public void setCodigoCurso(Long codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getNumeroAlumnos() {
		return numeroAlumnos;
	}
	public void setNumeroAlumnos(int numeroAlumnos) {
		this.numeroAlumnos = numeroAlumnos;
	}
}
