/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lestergarcia.bean;
import java.util.Date;import java.util.Date;
/**
 *
 * @author Lester Andrés García Aquino
 */
public final class Profesor extends Empleado{
    private int numeroPeriodos;
    public Profesor(){
        super();
    }

    public Profesor(String nombres, String apellidos, Date fechaNacimiento) {
        super(nombres, apellidos, fechaNacimiento);
    }

    public int getNumeroPeriodos() {
        return numeroPeriodos;
    }
    public void setNumeroPeriodos(int numeroPeriodos) {
        this.numeroPeriodos = numeroPeriodos;
    }
    
}
