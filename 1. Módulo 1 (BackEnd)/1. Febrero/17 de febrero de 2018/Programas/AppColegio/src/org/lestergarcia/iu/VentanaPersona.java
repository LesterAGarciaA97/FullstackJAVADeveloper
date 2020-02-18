/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lestergarcia.iu;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import org.lestergarcia.model.ModeloPersona;     
/**
 *
 * @author Lester Andrés García Aquino
 */
public class VentanaPersona extends JFrame{
    private JTable tblPersonas = new JTable();
    private JScrollPane jscPersonas = new JScrollPane();
    private ModeloPersona modelo = new ModeloPersona();
    public VentanaPersona(){
        this.setTitle("Ventana personas");
        this.setSize(800,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.jscPersonas.setBounds(5, 5, 790, 300);
        this.tblPersonas.setModel(modelo);
        this.jscPersonas.setViewportView(this.tblPersonas);
        this.setLayout(null);
        this.getContentPane().add(this.jscPersonas);
        this.setVisible(true);
    }
}
