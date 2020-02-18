package com.kalum.core.dao;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.kalum.core.model.Carrera;

@Repository
@Transactional
public class CarreraDaoImpl extends AbstractSession implements CarreraDao{
	@Override
	public void saveCarrera(Carrera elemento) {
		getSession().save(elemento);
	}
	@Override
	public void deleteCarreraById(Long codigoCarrera) {
		Carrera elemento = findById(codigoCarrera);
		if(elemento != null) {
			getSession().delete(elemento);
		}
	}
	@Override
	public void updateCarrera(Carrera elemento) {
		getSession().update(elemento);
	}
	@Override
	public List<Carrera> findAllCarreras() {
		return getSession().createQuery("from Carrera").list();
	}
	@Override
	public Carrera findById(Long codigoCarrera) {
		return (Carrera)getSession().get(Carrera.class,codigoCarrera);
	}
	@Override
	public Carrera findByDescripcion(String descripcion) {
		return (Carrera)getSession().createQuery("from Carrera where descripcion = :descripcion").setParameter("descripcion",descripcion).uniqueResult();
	}
}
