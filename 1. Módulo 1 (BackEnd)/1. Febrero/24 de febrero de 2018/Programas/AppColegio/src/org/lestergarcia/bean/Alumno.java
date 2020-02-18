/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lestergarcia.bean;

import java.util.Date;

/**
 *
 * @author Lester Andrés García Aquino
 */
public class Alumno extends Persona {
    private String carne;
    private String carrera;
    public Alumno(){
        super();
    }

    public Alumno(String nombres, String apellidos, Date fechaNacimiento) {
        super(nombres, apellidos, fechaNacimiento);
    }

    public String getCarne() {
        return carne;
    }
    public void setCarne(String carne) {
        this.carne = carne;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public void registrarAsistencia(){
        System.out.println(this.carne + " " + new Date());
    }
}
