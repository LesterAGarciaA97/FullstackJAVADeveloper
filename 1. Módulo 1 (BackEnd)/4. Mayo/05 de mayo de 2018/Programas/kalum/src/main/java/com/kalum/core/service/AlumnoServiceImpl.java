	package com.kalum.core.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kalum.core.dao.AlumnoDao;
import com.kalum.core.model.Alumno;

@Service("alumnoService")
@Transactional
public class AlumnoServiceImpl implements AlumnoService{
	@Autowired
	private AlumnoDao alumnoServiceDao;
	@Override
	public void saveAlumno(Alumno elemento) {
		alumnoServiceDao.saveAlumno(elemento);
	}
	@Override
	public void deleteCarreraById(Long codigoAlumno) {
		alumnoServiceDao.deleteCarreraById(codigoAlumno);	
	}
	@Override
	public void updateAlumno(Alumno elemento) {
		alumnoServiceDao.updateAlumno(elemento);
	}
	@Override
	public List<Alumno> findAllAlumnos() {
		return alumnoServiceDao.findAllAlumnos();
	}
	@Override
	public Alumno findById(Long codigoAlumno) {
		return alumnoServiceDao.findById(codigoAlumno);
	}
	@Override
	public Alumno findByCarne(String carne) {
		return alumnoServiceDao.findByCarne(carne);
	}
	@Override
	public Alumno findByapellidos(String apellidos) {
		return alumnoServiceDao.findByapellidos(apellidos);
	}
	@Override
	public Alumno findBynombres(String nombres) {
		return alumnoServiceDao.findBynombres(nombres);
	}
	@Override
	public Alumno findByfechaNacimiento(Date fechaNacimiento) {
		return alumnoServiceDao.findByfechaNacimiento(fechaNacimiento);
	}
}
