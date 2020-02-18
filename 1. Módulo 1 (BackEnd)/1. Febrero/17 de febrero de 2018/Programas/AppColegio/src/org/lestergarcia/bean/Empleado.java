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
public abstract class Empleado extends Persona{
    private String puesto;
    public Empleado(){
        super();
    }

    public Empleado(String nombres, String apellidos, Date fechaNacimiento) {
        super(nombres, apellidos, fechaNacimiento);
    }
    
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public void registrarAsistencia(){
        System.out.println(this.getId()+ " " + new Date());
    }
}
