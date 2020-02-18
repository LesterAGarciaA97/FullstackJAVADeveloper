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
public class Director extends Empleado {
    private String nivelAcademico;

    public Director() {
        super();
    }
    public Director(String nivelAcademico, double salario, String puesto, String nombres, String apellidos, Date fechaNacimiento, String cui) {
        super(salario, puesto, nombres, apellidos, fechaNacimiento, cui);
        this.nivelAcademico = nivelAcademico;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }
    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }
}
