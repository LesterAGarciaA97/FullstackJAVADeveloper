package org.lestergarcia.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;

import java.io.IOException;

public class ServletAutenticar extends HttpServlet {
	
	public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {
		doPost(peticion,respuesta);
	}
	
	public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {
		RequestDispatcher despachador = null;
		String login = peticion.getParameter("txtLogin");
		String password = peticion.getParameter("txtPassword");
		if(login.equals("lgarcia") && password.equals("123")) {
			peticion.setAttribute("usuario", "Lester García");
			despachador = peticion.getRequestDispatcher("index.jsp");
		}else {
			despachador = peticion.getRequestDispatcher("login.jsp");
		}
		despachador.forward(peticion, respuesta);
	}
	
	
}
