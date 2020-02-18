package com.kalum.core.model;
import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;

@Entity
@Table(name="profesor")
public class Profesor implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="codigo_profesor")
	private Long codigoProfesor;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="nombres")
	private String nombres;
	@Column(name="profesor")
	private String puesto;
	@Column(name="fecha_nacimiento")
	private Date fechaNacimiento;
	@Column(name="numero_periodos")
	private int numeroPeriodos;
	@OneToMany(mappedBy="profesor", fetch = FetchType.EAGER)
	private Set<ProfesorCurso> profesorCursos;
	public Profesor() {
		//Null Constructor
	}
	public Profesor(Long codigoProfesor, String apellidos, String nombres, String puesto, Date fechaNacimiento,
			int numeroPeriodos) {
		super();
		this.codigoProfesor = codigoProfesor;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.puesto = puesto;
		this.fechaNacimiento = fechaNacimiento;
		this.numeroPeriodos = numeroPeriodos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((codigoProfesor == null) ? 0 : codigoProfesor.hashCode());
		result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());
		result = prime * result + ((nombres == null) ? 0 : nombres.hashCode());
		result = prime * result + numeroPeriodos;
		result = prime * result + ((puesto == null) ? 0 : puesto.hashCode());
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
		Profesor other = (Profesor) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (codigoProfesor == null) {
			if (other.codigoProfesor != null)
				return false;
		} else if (!codigoProfesor.equals(other.codigoProfesor))
			return false;
		if (fechaNacimiento == null) {
			if (other.fechaNacimiento != null)
				return false;
		} else if (!fechaNacimiento.equals(other.fechaNacimiento))
			return false;
		if (nombres == null) {
			if (other.nombres != null)
				return false;
		} else if (!nombres.equals(other.nombres))
			return false;
		if (numeroPeriodos != other.numeroPeriodos)
			return false;
		if (puesto == null) {
			if (other.puesto != null)
				return false;
		} else if (!puesto.equals(other.puesto))
			return false;
		return true;
	}
	public Long getCodigoProfesor() {
		return codigoProfesor;
	}
	public void setCodigoProfesor(Long codigoProfesor) {
		this.codigoProfesor = codigoProfesor;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getNumeroPeriodos() {
		return numeroPeriodos;
	}
	public void setNumeroPeriodos(int numeroPeriodos) {
		this.numeroPeriodos = numeroPeriodos;
	}
}
