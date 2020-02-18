/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lestergarcia.iu;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.lestergarcia.model.ModeloPersona;     
/**
 *
 * @author Lester Andrés García Aquino
 */
public class VentanaPersona extends JFrame implements ActionListener{
    private JTable tblPersonas = new JTable();
    private JScrollPane jscPersonas = new JScrollPane();
    private ModeloPersona modelo = new ModeloPersona();
    private JButton btnAlumno = new JButton("Alumno");
    private JButton btnProfesor = new JButton("Profesor");
    private JButton btnGerente = new JButton("Gerente");
    private JButton btnEliminar = new JButton("Eliminar");
    public VentanaPersona(){
        this.setTitle("Ventana personas");
        this.setSize(800,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.jscPersonas.setBounds(5,5,770,300);
        this.btnAlumno.setBounds (5,315,120,40);
        this.btnProfesor.setBounds (130,315,120,40);
        this.btnGerente.setBounds (255,315,120,40);
        this.btnEliminar.setBounds (380,315,120,40);
        this.btnAlumno.addActionListener(this);
        this.btnEliminar.addActionListener(this);
        this.tblPersonas.setModel(modelo);
        this.jscPersonas.setViewportView(this.tblPersonas);
        this.setLayout(null);
        this.getContentPane().add(this.jscPersonas);
        this.getContentPane().add(this.btnAlumno);
        this.getContentPane().add(this.btnProfesor);
        this.getContentPane().add(this.btnGerente);
        this.setVisible(true);
        this.getContentPane().add(this.btnEliminar);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource () == btnAlumno) {
            VentanaAgregarAlumno ventana = new VentanaAgregarAlumno("Nuevo Alumno",400,300, this.modelo);
        }else if (e.getSource() == btnEliminar){
            if (modelo.getRowCount() > 0) {
                if (tblPersonas.getSelectedRow() >= 0) {
                    int resultado = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere eliminar el registro?", "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (resultado == JOptionPane.YES_OPTION) {
                        modelo.eliminar(modelo.elemento(tblPersonas.getSelectedRow()));
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento para poder eliminarlo");
                }
            }else{
                JOptionPane.showMessageDialog(null, "No existen registros");
            }
        }
    }
}
