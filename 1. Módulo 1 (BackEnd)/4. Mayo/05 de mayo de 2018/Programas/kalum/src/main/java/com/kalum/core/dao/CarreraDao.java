package com.kalum.core.dao;
import java.util.List;
import com.kalum.core.model.Carrera;

public interface CarreraDao {
	void saveCarrera(Carrera elemento);
	void deleteCarreraById(Long codigoCarrera);
	void updateCarrera(Carrera elemento);
	List<Carrera> findAllCarreras();
	Carrera findById(Long codigoCarrera);
	Carrera findByDescripcion(String descripcion);
}
