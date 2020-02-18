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
public class Profesor extends Empleado{
    private int numeroCursos;

    public Profesor() {
        super();
    }
    public Profesor(int numeroCursos, double salario, String puesto, String nombres, String apellidos, Date fechaNacimiento, String cui) {
        super(salario, puesto, nombres, apellidos, fechaNacimiento, cui);
        this.numeroCursos = numeroCursos;
    }

    public int getNumeroCursos() {
        return numeroCursos;
    }
    public void setNumeroCursos(int numeroCursos) {
        this.numeroCursos = numeroCursos;
    }   
}
