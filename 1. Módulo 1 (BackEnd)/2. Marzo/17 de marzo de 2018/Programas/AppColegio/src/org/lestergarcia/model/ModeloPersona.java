/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lestergarcia.model;
import javax.swing.table.AbstractTableModel;
import org.lestergarcia.controller.MantenimientoController;
import org.lestergarcia.bean.Persona;
/**
 *
 * @author Lester Andrés García Aquino
 */
public class ModeloPersona extends AbstractTableModel{
    private String encabezados[] = {"Codigo", "Nombres", "Apellidos", "Fecha de nacimiento"};
    //private MantenimientoController mantenimiento = new MantenimientoController();
    @Override
    public int getRowCount() {
        return MantenimientoController.getInstancia().listar().size();
        //return mantenimiento.listar().size();
    }
    @Override
    public String getColumnName(int fila){
        return encabezados[fila];
    }
    @Override
    public int getColumnCount() {
        return encabezados.length;
    }
    @Override
    public Object getValueAt(int fila, int columna) {
        String resultado = "";
        Persona elemento = MantenimientoController.getInstancia().listar().get(fila);
        switch(columna){
            case 0:
                resultado = String.valueOf(elemento.getId());
                break;
            case 1:
                resultado = elemento.getNombres();
                break;
            case 2:
                resultado = elemento.getApellidos();
                break;
            case 3:
                resultado = String.valueOf(elemento.getFechaNacimiento());
        }
        return resultado;
    }
    public void agregar(Persona elemento){
        MantenimientoController.getInstancia().agregar(elemento);
        fireTableDataChanged();
    }
    public void eliminar(Persona elemento){
        MantenimientoController.getInstancia().eliminar(elemento);
        fireTableDataChanged();
    }
    public Persona elemento(int posicion){
        return MantenimientoController.getInstancia().listar().get(posicion);
    }
}
