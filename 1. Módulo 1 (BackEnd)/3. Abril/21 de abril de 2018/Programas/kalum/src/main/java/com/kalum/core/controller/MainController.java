package com.kalum.core.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kalum.core.model.Carrera;
import com.kalum.core.service.CarreraService;

@Controller
public class MainController {
	@Autowired
	private CarreraService carreraService;
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		String response = "<h1>Sistema de gestión de alumnos</h1>";
		
		/*Carrera nuevo = new Carrera();
		nuevo.setDescripcion("Perito en mecánica automotriz");
		carreraService.saveCarrera(nuevo);
        return response;*/
		
		/*Carrera nuevo = new Carrera();
		nuevo.setDescripcion("Conceptos con programación avanzada");
		carreraService.saveCarrera(nuevo);
		return response;*/
		
		/*Carrera nuevo = new Carrera();
		nuevo.setDescripcion("Fundamentos de base de datos");
		carreraService.saveCarrera(nuevo);
		return response;*/
		
		/*Carrera nuevo = new Carrera();
		nuevo.setDescripcion("Java JPA e Hibernate");
		carreraService.saveCarrera(nuevo);
		return response;*/
		
		return response;	
	}
}
