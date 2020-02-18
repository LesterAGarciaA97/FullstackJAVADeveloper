package org.lestergarcia.core.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carrera")
public class Carrera implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigo_carrera")
    private Long codigoCarrera;
    @Column(name="descripcion")
    private String descripcion;
    public Carrera(){
        //Null constructor
    }
    public Carrera(Long codigoCarrera, String descripcion) {
        this.codigoCarrera = codigoCarrera;
        this.descripcion = descripcion;
    }
    public Long getCodigoCarrera() {
        return codigoCarrera;
    }
    public void setCodigoCarrera(Long codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    @Override
    public String toString() {
        return "Carrera{" + "codigoCarrera=" + codigoCarrera + ", descripcion=" + descripcion + '}';
    }
}