/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lestergarcia.iu;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author Lester Andrés García Aquino
 */
public abstract class VentanaAgregar extends JDialog {
    private JLabel lblApellidos = new JLabel ("Apellidos");
    private JLabel lblNombres = new JLabel ("Nombres");
    private JLabel lblFecha = new JLabel ("Fecha Nacimiento");
    private JTextField txtApellidos = new JTextField();
    private JTextField txtNombres = new JTextField();
    private JTextField txtFechaNacimiento = new JTextField();
    private JButton btnGuardar = new JButton ("Guardar");
    
    public VentanaAgregar(String titulo, int ancho, int alto){
        this.setTitle(titulo);
        this.setSize(ancho, alto);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.getContentPane().add(this.lblApellidos);
        this.getContentPane().add(this.lblNombres);
        this.getContentPane().add(this.lblFecha);
        this.getContentPane().add(this.txtApellidos);
        this.getContentPane().add(this.txtNombres);
        this.getContentPane().add(this.lblFecha);
        this.getContentPane().add(this.btnGuardar);
    }

    public JLabel getLblApellidos() {
        return lblApellidos;
    }
    public void setLblApellidos(JLabel lblApellidos) {
        this.lblApellidos = lblApellidos;
    }
    public JLabel getLblNombres() {
        return lblNombres;
    }
    public void setLblNombres(JLabel lblNombres) {
        this.lblNombres = lblNombres;
    }
    public JLabel getLblFecha() {
        return lblFecha;
    }
    public void setLblFecha(JLabel lblFecha) {
        this.lblFecha = lblFecha;
    }
    public JTextField getTxtApellidos() {
        return txtApellidos;
    }
    public void setTxtApellidos(JTextField txtApellidos) {
        this.txtApellidos = txtApellidos;
    }
    public JTextField getTxtNombres() {
        return txtNombres;
    }
    public void setTxtNombres(JTextField txtNombres) {
        this.txtNombres = txtNombres;
    }
    public JTextField getTxtFechaNacimiento() {
        return txtFechaNacimiento;
    }
    public void setTxtFechaNacimiento(JTextField txtFechaNacimiento) {
        this.txtFechaNacimiento = txtFechaNacimiento;
    }
    public JButton getBtnGuardar() {
        return btnGuardar;
    }
    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }
}
