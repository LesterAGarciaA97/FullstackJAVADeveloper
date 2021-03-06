package com.kalum.core.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriComponentsBuilder;

import com.kalum.core.model.Carrera;

import com.kalum.core.service.CarreraService;

@Controller
@RequestMapping("/api/v1")
public class CarreraController {
	@Autowired
	private CarreraService carreraService;
	
	@RequestMapping(value="/carrera",method = RequestMethod.GET,headers = "Accept=application/json")
	public ResponseEntity<List<Carrera>> getCarrera(@RequestParam(value="descripcion",required=false)String descripcion){
		List<Carrera> carreras = new ArrayList<Carrera>();
		if(descripcion != null) {
			Carrera elemento = carreraService.findByDescripcion(descripcion);
			if(elemento == null) {
				return new ResponseEntity(HttpStatus.NO_CONTENT);
			}else {
				carreras.add(elemento);
			}
		}else {
			carreras = carreraService.findAllCarreras();
			if(carreras.isEmpty()) {
				return new ResponseEntity(HttpStatus.NO_CONTENT);
			}
		}
		return new ResponseEntity<List<Carrera>>(carreras,HttpStatus.OK);
	}
	//GET FINDBYID
	@RequestMapping(value="/carrera/{id}",method = RequestMethod.GET,headers="Accept=application/json")
	public ResponseEntity<Carrera> getCarreraById(@PathVariable("id") Long id){
		Carrera elemento = carreraService.findById(id);
		if(elemento == null) {
			return new ResponseEntity<Carrera>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Carrera>(elemento,HttpStatus.OK);
	}
	//POST
	@RequestMapping(value="/carrera",method = RequestMethod.POST,headers="Accept=application/json")
	public ResponseEntity<?> createCarrera(@RequestBody Carrera carrera,UriComponentsBuilder ucBuilder){
		if(carreraService.findByDescripcion(carrera.getDescripcion())!= null) {
			return new ResponseEntity("Existe una carrera con esa descripción", HttpStatus.CONFLICT);
		}
		carreraService.saveCarrera(carrera);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/api/v1/carrera/{id}").buildAndExpand(carrera.getCodigoCarera()).toUri());
		return new ResponseEntity<String>(headers,HttpStatus.CREATED);
	}
}
