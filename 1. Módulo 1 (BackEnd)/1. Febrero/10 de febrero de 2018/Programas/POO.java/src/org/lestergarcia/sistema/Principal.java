/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lestergarcia.sistema;
import java.util.ArrayList;
import java.util.Date;
import org.lestergarcia.bean.Persona;
import org.lestergarcia.bean.Alumno;
import org.lestergarcia.bean.Profesor;
/**
 *
 * @author Lester Andrés García Aquino
 */
public class Principal {
    public static void main(String arg[]){
        ArrayList<Persona> colegio = new ArrayList<Persona>();
        Alumno luisPerez = new Alumno("201800", "Cuarto Perito", "Luis", "Pérez", new Date(), "24869897810101");
        Alumno alejandroPaz = new Alumno("201801", "Cuarto Perito", "Alejandro", "Paz", new Date(), "24869897810101");
        Profesor juanPerez = new Profesor(2,4560.25, "Instructor de computación", "Juan", "Pérez", new Date(), "25451");
        colegio.add(juanPerez);
        colegio.add(luisPerez);
        colegio.add(alejandroPaz);
        for(Persona elemento : colegio){
            elemento.marcarAsistencia();
        }
    }
}
