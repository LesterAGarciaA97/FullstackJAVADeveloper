/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lestergarcia.controller;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.lestergarcia.bean.Persona;
import org.lestergarcia.bean.Alumno;
import org.lestergarcia.bean.Profesor;
import org.lestergarcia.interfaces.Mantenimiento;
import org.lestergarcia.db.Conexion;
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
    public MantenimientoController(){
        ResultSet datos =   Conexion.getInstancia().hacerConsulta("CALL sp_ConsultaAlumnos();");
        ResultSet profesores = Conexion.getInstancia().hacerConsulta("CALL sp_ConsultaProfesores();");
        try{
            while(datos.next()){
                Persona elemento = new Alumno(datos.getString("carne"), datos.getString("descripcion"), datos.getString("nombres"), datos.getString("apellidos"), datos.getDate("fecha_nacimiento"));
                listaPersonas.add(elemento);
            }
             while(profesores.next()){
                Persona elemento = new Profesor(/*profesores.getInt("numero_periodos"), profesores.getString("puesto"),*/ datos.getString("nombres"), datos.getString("apellidos"), datos.getDate("fecha_nacimiento"));
                listaPersonas.add(elemento);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
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
