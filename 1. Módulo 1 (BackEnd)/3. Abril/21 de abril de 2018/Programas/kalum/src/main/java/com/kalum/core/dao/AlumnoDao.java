package com.kalum.core.dao;
import java.util.Date;
import java.util.List;

import com.kalum.core.model.Alumno;

public interface AlumnoDao {
	void saveAlumno(Alumno elemento);
	void deleteCarreraById(Long codigoAlumno);
	void updateAlumno(Alumno elemento);
	List<Alumno> findAllAlumnos();
	Alumno findById(Long codigoAlumno);
	Alumno findByCarne(String carne);
	Alumno findByapellidos(String apellidos);
	Alumno findBynombres(String nombres);
	Alumno findByfechaNacimiento(Date fechaNacimiento);
}
