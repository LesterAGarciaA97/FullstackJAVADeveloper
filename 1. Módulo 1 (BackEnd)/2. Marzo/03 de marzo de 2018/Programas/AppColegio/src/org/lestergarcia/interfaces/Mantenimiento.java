/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lestergarcia.interfaces;
import org.lestergarcia.bean.Persona;
import java.util.ArrayList;
/**
 *
 * @author Lester Andrés García Aquino
 */
public interface Mantenimiento {
    static final int vesion =1;
    public Persona buscar(int id);
    public ArrayList<Persona> listar();
    public void agregar (Persona elemento);
    public void eliminar (Persona elemento);
    public void modificar (int posicion, Persona elemento);
}
