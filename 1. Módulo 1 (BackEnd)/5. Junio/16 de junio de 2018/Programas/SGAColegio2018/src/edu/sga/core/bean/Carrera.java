package edu.sga.core.bean;

import java.io.Serializable;

public class Carrera implements Serializable {
    private Long codigoCarrera;
    private String descripcion;
    
    public Carrera(){
        
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
}
