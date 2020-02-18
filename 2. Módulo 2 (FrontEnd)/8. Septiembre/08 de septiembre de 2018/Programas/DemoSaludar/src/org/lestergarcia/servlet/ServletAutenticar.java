package org.lestergarcia.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.lestergarcia.bean.Usuario;
import org.lestergarcia.db.Conexion;

public class ServletAutenticar extends HttpServlet {
	
	public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {
		doPost(peticion,respuesta);
	}
	
	public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {
		RequestDispatcher despachador = null;
		String login = peticion.getParameter("txtLogin");
		String password = peticion.getParameter("txtPassword");
		Usuario usuario = null;
		try {
			PreparedStatement procedimiento = Conexion.getInstancia().getConexion().prepareStatement("CALL sp_Autenticar(?,?)");
			procedimiento.setString(1,login);
			procedimiento.setString(2,password);
			ResultSet registro = procedimiento.executeQuery();
			while(registro.next()) {
				usuario = new Usuario();
				usuario.setCodigoUsuario(registro.getInt("codigo_usuario"));
				usuario.setNombre(registro.getString("nombre"));
				usuario.setApellido(registro.getString("apellido"));
				usuario.setEmail(registro.getString("email"));
				usuario.setDireccion(registro.getString("direccion"));
				usuario.setTelefono(registro.getString("telefono"));
				usuario.setLogin(registro.getString("login"));
				usuario.setPassword(registro.getString("password"));				
			}
			if(usuario != null) {
				peticion.setAttribute("usuario",usuario);			
				despachador = peticion.getRequestDispatcher("index.jsp");
			}else {
				despachador = peticion.getRequestDispatcher("login.jsp");
			}
		}catch(SQLException e) {
			e.printStackTrace();
			despachador = peticion.getRequestDispatcher("login.jsp");
		}
		despachador.forward(peticion,respuesta);
	}
}
