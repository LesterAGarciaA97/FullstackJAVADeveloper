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
public final class Gerente extends Empleado {
    private String depto;
    public Gerente(){
        super();
    }
    
        public Gerente(String nombres, String apellidos, Date fechaNacimiento) {
        super(nombres, apellidos, fechaNacimiento);
        this.depto = depto;
    }

    public String getDepto() {
        return depto;
    }
    public void setDepto(String depto) {
        this.depto = depto;
    }  
}
