package com.kalum.core.dao;
import java.util.List;

import com.kalum.core.model.Curso;

public interface CursoDao {
	void saveAlumno(Curso elemento);
	void deleteCursoById(Long codigoCurso);
	void updateAlumno(Curso elemento);
	List<Curso> findAllAlumnos();
	Curso findById(Long codigoCurso);
	Curso findByDescripcion(String descripcion);
	Curso findBynumeroAlumnos(int numeroAlumnos);
}
