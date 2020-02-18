/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lestergarcia.controller;
import java.util.ArrayList;
import org.lestergarcia.bean.Persona;
import org.lestergarcia.interfaces.Mantenimiento;
/**
 *
 * @author Lester Andrés García Aquino
 */
public class MantenimientoController implements Mantenimiento{
  
    private ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
    private static MantenimientoController instancia;
    public static MantenimientoController getInstancia(){
        if (instancia == null){
            instancia = new MantenimientoController();
        }
        return instancia;
    }
    
    @Override
    public Persona buscar(int id) {
        Persona elemento = null;
        for (Persona p : listaPersonas) {
            if (p.getId() == id) {
                elemento = p;
                break;
            }
        }
        return elemento;
    }
    @Override
    public ArrayList<Persona> listar() {
        return listaPersonas;
    }
    @Override
    public void agregar(Persona elemento) {
        listaPersonas.add(elemento);
    }
    @Override
    public void eliminar(Persona elemento) {
       listaPersonas.remove(elemento);
    }
    @Override
    public void modificar(int posicion, Persona elemento) {
        listaPersonas.set(posicion, elemento);
    }
}
