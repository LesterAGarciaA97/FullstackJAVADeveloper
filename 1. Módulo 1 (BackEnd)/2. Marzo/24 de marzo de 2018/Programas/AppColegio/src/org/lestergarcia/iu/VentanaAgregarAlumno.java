/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lestergarcia.iu;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Date;
import org.lestergarcia.bean.Alumno;
import org.lestergarcia.model.ModeloPersona;
/**
 *
 * @author Lester Andrés García Aquino
 */
public class VentanaAgregarAlumno extends VentanaAgregar implements ActionListener{
    private JLabel lblCarne = new JLabel ("Carné");
    private JTextField txtCarne = new JTextField ();
    private JLabel lblCarrera = new JLabel ("Carrera");
    private JTextField txtCarreras = new JTextField();
    private ModeloPersona modelo;
    
    public VentanaAgregarAlumno(String titulo, int ancho, int alto, ModeloPersona modelo) {
        super(titulo, ancho, alto);
        this.modelo = modelo;
        this.lblCarne.setBounds(5,5,100,20);
        this.txtCarne.setBounds(120,5,250,20);
        this.getContentPane().add(lblCarne);
        this.getContentPane().add(txtCarne);
        this.getContentPane().add(lblCarrera);
        this.getContentPane().add(txtCarreras);
        this.getLblNombres().setBounds(5,30,100,20);
        this.getTxtNombres().setBounds(120,30,250,20);
        this.getLblApellidos().setBounds(5,55,100,20);
        this.getTxtApellidos().setBounds(120,55,250,20);
        this.getLblFecha().setBounds(5,80,200,20);
        this.getTxtFechaNacimiento().setBounds(120,80,250,20);
        this.getLblCarrera().setBounds(5,105,150,20); 
        this.getTxtCarreras().setBounds(120,105,250,20);
        this.getBtnGuardar().setBounds(200,140,120,40);
        this.getBtnGuardar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Alumno nuevo = new Alumno();
        nuevo.setCarne(txtCarne.getText());
        nuevo.setApellidos(this.getTxtApellidos().getText());
        nuevo.setNombres(this.getTxtNombres().getText());
        nuevo.setFechaNacimiento(new Date());
        nuevo.setCarrera(txtCarreras.getText());
        modelo.agregar(nuevo);
        javax.swing.JOptionPane.showMessageDialog(null, "Registro guardado");
        this.dispose();
    }
}
