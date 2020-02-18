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
public abstract class Persona {
    private int id;
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;
    private static int numeroPersonas = 0;
    public Persona(){
        numeroPersonas = numeroPersonas + 1;
        this.id = numeroPersonas;
    }
    
    public Persona(String nombres, String apellidos, Date fechaNacimiento) {
        numeroPersonas = numeroPersonas + 1;
        this.id = numeroPersonas;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }
    public abstract void registrarAsistencia();
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public static int getNumeroPersonas() {
        return numeroPersonas;
    }
    public static void setNumeroPersonas(int numeroPersonas) {
        Persona.numeroPersonas = numeroPersonas;
    }
    
        public String toString(){
        return this.nombres + " " + this.apellidos;
    }
}
