package org.lestergarcia.servlet;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.lestergarcia.db.Conexion;

public class ServletRegistro extends HttpServlet {
	public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) throws IOException,ServletException {
		doPost(peticion,respuesta);
	}
	public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta) throws IOException,ServletException {
		RequestDispatcher despachador = null;
		String nombre = peticion.getParameter("txtNombre");
		String apellido = peticion.getParameter("txtApellido");
		String email = peticion.getParameter("txtEmail");
		String direccion = peticion.getParameter("txtDireccion");
		String telefono = peticion.getParameter("txtTelefono");
		String login = peticion.getParameter("txtLogin");
		String password = peticion.getParameter("txtPassword");	
		try {
			PreparedStatement procedimiento = Conexion.getInstancia().getConexion().prepareStatement("call sp_Registrar(?,?,?,?,?,?,?)");
			procedimiento.setString(1,nombre);
			procedimiento.setString(2,apellido);
			procedimiento.setString(3,email);
			procedimiento.setString(4,direccion);
			procedimiento.setString(5,telefono);
			procedimiento.setString(6,login);
			procedimiento.setString(7,password);
			procedimiento.executeQuery();
			peticion.setAttribute("usuario", nombre + " " + apellido);
			despachador = peticion.getRequestDispatcher("index.jsp");
		}catch(SQLException e) {
			e.printStackTrace();
			despachador = peticion.getRequestDispatcher("registro.jsp");
		}
		despachador.forward(peticion,respuesta);
	}
}
