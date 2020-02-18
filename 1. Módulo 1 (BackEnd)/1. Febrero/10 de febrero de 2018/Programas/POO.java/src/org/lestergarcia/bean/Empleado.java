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
public abstract class Empleado extends Persona {
    private double salario;
    private String puesto;

    public Empleado() {
        super();
    }
    public Empleado(double salario, String puesto, String nombres, String apellidos, Date fechaNacimiento, String cui) {
        super(nombres, apellidos, fechaNacimiento, cui);
        this.salario = salario;
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public void marcarAsistencia(){
        System.out.println("Marcar asistencia con huella digital");
    }
}
