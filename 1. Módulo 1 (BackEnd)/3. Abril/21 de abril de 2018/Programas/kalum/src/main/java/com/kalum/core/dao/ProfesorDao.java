package com.kalum.core.dao;
import java.util.Date;
import java.util.List;

import com.kalum.core.model.Profesor;

public interface ProfesorDao {
	void saveAlumno(Profesor elemento);
	void deleteCarreraById(Long codigoProfesor);
	void updateAlumno(Profesor elemento);
	List<Profesor> findAllProfesores();
	Profesor findById(Long codigoProfesor);
	Profesor findBynumeroPeriodos(int numeroPeriodos);
	Profesor findByapellidos(String apellidos);
	Profesor findBynombres(String nombres);
	Profesor findByfechaNacimiento(Date fechaNacimiento);
}
