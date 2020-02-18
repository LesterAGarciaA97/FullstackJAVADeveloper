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
public class Alumno extends Persona{
    private String carne;
    private String grado;

    public Alumno() {
        super();
    }
    public Alumno(String carne, String grado, String nombres, String apellidos, Date fechaNacimiento, String cui) {
        super(nombres, apellidos, fechaNacimiento, cui);
        this.carne = carne;
        this.grado = grado;
    }

    public String getCarne() {
        return carne;
    }
    public void setCarne(String carne) {
        this.carne = carne;
    }
    public String getGrado() {
        return grado;
    }
    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public void marcarAsistencia() {
        System.out.println("Marcar asistencia con carné");
    }
}
