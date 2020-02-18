package com.kalum.core.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

import com.kalum.core.model.Alumno;
import com.kalum.core.model.Carrera;
import com.kalum.core.service.AlumnoService;
import com.kalum.core.service.CarreraService;

@Controller
public class MainController {
	@Autowired
	private CarreraService carreraService;
	@Autowired
	private AlumnoService alumnoService;
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
		
		Carrera nuevo = new Carrera();
		nuevo.setDescripcion("Robótica");
		
		Alumno jose = new Alumno();
		jose.setNombres("José");
		jose.setApellidos("Pérez");
		jose.setCarne("2018004");
		jose.setCarrera(nuevo);
		jose.setFechaNacimiento(new Date());
		
		Alumno maria = new Alumno();
		jose.setNombres("María");
		jose.setApellidos("Jiménez");
		jose.setCarne("2018005");
		jose.setCarrera(nuevo);
		maria.setFechaNacimiento(new Date());
		
		nuevo.getAlumnos().add(jose);
		nuevo.getAlumnos().add(maria);
		carreraService.saveCarrera(nuevo);
		
		return response;	
	}
}
