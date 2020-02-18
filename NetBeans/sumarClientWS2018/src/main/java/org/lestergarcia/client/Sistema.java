package org.lestergarcia.client;

import clientews.servicio.ServicioSumarWSImplService;
import clientews.servicio.ServicioSumarWS;
import javax.swing.JOptionPane;

public class Sistema {
    public static void main(String arg[]){
        ServicioSumarWS sumar = new ServicioSumarWSImplService().getServicioSumarWSImplPort();
        System.out.println("Ejecutando el web service sumar");
        String x = JOptionPane.showInputDialog(null, "x");
        String y = JOptionPane.showInputDialog(null, "y");
        System.out.println("Sumar: " + x + " + " + y + " = ?");
        JOptionPane.showMessageDialog(null, "Resultado = " + sumar.sumar(Integer.parseInt(x), Integer.parseInt(y)));
        System.out.println("Fin del proceso");
    }
}
