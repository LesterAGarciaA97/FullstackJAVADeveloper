package edu.sga.core.sistema;

import edu.sga.core.controller.CarreraController;
import edu.sga.core.bean.Carrera;

public class Principal {
    public static void main(String arg[]){
        /*for (Carrera elemento : CarreraController.getInstancia().getCarrera()) {
            System.out.println(elemento.getCodigoCarrera() + "|" + elemento.getDescripcion());
        }*/
        Carrera nuevo = new Carrera();
        nuevo.setDescripcion("Nueva carrera");
        CarreraController.getInstancia().agregar(nuevo);
    }
}
