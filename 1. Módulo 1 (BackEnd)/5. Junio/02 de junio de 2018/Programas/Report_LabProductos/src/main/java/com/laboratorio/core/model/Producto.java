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
@Table(name="producto")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo_producto")
	private Long codigoProducto;
	@Column(name="nombre")
	private String nombre;
	@Column(name="modelo")
	private String modelo;
	@Column(name="tipo_instrumento")
	private String tipoInstrumento;
	@Column(name="precio")
	private Long precio;
	@Column(name="garantia_meses")
	private int garantiaMeses;
	@Column(name="pais_procedencia")
	private String paisProcedencia;
	
	public Producto() {
		//Null Constructor
	}
	public Producto(Long codigoProducto, String nombre, String modelo, String tipoInstrumento, Long precio,
			int garantiaMeses, String paisProcedencia) {
		super();
		this.codigoProducto = codigoProducto;
		this.nombre = nombre;
		this.modelo = modelo;
		this.tipoInstrumento = tipoInstrumento;
		this.precio = precio;
		this.garantiaMeses = garantiaMeses;
		this.paisProcedencia = paisProcedencia;
	}
	public Long getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(Long codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipoInstrumento() {
		return tipoInstrumento;
	}
	public void setTipoInstrumento(String tipoInstrumento) {
		this.tipoInstrumento = tipoInstrumento;
	}
	public Long getPrecio() {
		return precio;
	}
	public void setPrecio(Long precio) {
		this.precio = precio;
	}
	public int getGarantiaMeses() {
		return garantiaMeses;
	}
	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}
	public String getPaisProcedencia() {
		return paisProcedencia;
	}
	public void setPaisProcedencia(String paisProcedencia) {
		this.paisProcedencia = paisProcedencia;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoProducto == null) ? 0 : codigoProducto.hashCode());
		result = prime * result + garantiaMeses;
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((paisProcedencia == null) ? 0 : paisProcedencia.hashCode());
		result = prime * result + ((precio == null) ? 0 : precio.hashCode());
		result = prime * result + ((tipoInstrumento == null) ? 0 : tipoInstrumento.hashCode());
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
		Producto other = (Producto) obj;
		if (codigoProducto == null) {
			if (other.codigoProducto != null)
				return false;
		} else if (!codigoProducto.equals(other.codigoProducto))
			return false;
		if (garantiaMeses != other.garantiaMeses)
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (paisProcedencia == null) {
			if (other.paisProcedencia != null)
				return false;
		} else if (!paisProcedencia.equals(other.paisProcedencia))
			return false;
		if (precio == null) {
			if (other.precio != null)
				return false;
		} else if (!precio.equals(other.precio))
			return false;
		if (tipoInstrumento == null) {
			if (other.tipoInstrumento != null)
				return false;
		} else if (!tipoInstrumento.equals(other.tipoInstrumento))
			return false;
		return true;
	}
}
