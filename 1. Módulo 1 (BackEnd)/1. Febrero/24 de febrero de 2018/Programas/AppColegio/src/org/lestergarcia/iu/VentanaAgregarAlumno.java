/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lestergarcia.iu;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
/**
 *
 * @author Lester Andrés García Aquino
 */
public class VentanaAgregarAlumno extends VentanaAgregar{
    private JLabel lblCarne = new JLabel ("Carné");
    private JTextField txtCarne = new JTextField ();
    private JLabel lblCarrera = new JLabel ("Carrera");
    private JComboBox cmbCarreras = new JComboBox();
    
    public VentanaAgregarAlumno(String titulo, int ancho, int alto) {
        super(titulo, ancho, alto);
        this.lblCarne.setBounds(5,5,100,20);
        this.txtCarne.setBounds(100,5,250,20);
        this.getContentPane().add(lblCarne);
        this.getContentPane().add(txtCarne);
        this.getContentPane().add(lblCarrera);
        this.getContentPane().add(cmbCarreras);
        this.getLblNombres().setBounds(5,30,100,20);
        this.getTxtNombres().setBounds(100,30,250,20);
        this.getLblApellidos().setBounds(5,55,100,20);
        this.getTxtApellidos().setBounds(100,55,250,20);
        this.getLblFecha().setBounds(5,80,100,20);
        this.getTxtFechaNacimiento().setBounds(100,80,250,20);
        this.lblCarrera.setBounds(5,105,150,20);
        this.cmbCarreras.setBounds(100,105,250,20);
        this.cmbCarreras.addItem("Seleccionar");
        this.cmbCarreras.addItem("Informática");
        this.cmbCarreras.addItem("Perito en electrónica");
        this.cmbCarreras.addItem("Secretariado bilingüe");
        this.getContentPane().add(this.lblCarrera);
        this.getContentPane().add(this.cmbCarreras);
        this.getBtnGuardar().setBounds(200,140,120,40);
    }
}
