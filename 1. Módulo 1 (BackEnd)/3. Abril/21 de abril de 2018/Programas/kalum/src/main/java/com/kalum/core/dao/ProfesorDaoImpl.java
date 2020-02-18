package com.kalum.core.dao;
import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.kalum.core.model.Profesor;

@Repository
@Transactional
public class ProfesorDaoImpl extends AbstractSession implements ProfesorDao {
	@Override
	public void saveAlumno(Profesor elemento) {
		getSession().save(elemento);
	}
	@Override
	public void deleteCarreraById(Long codigoProfesor) {
		Profesor elemento = findById(codigoProfesor);
		if(elemento != null) {
			getSession().delete(elemento);
		}	
	}
	@Override
	public void updateAlumno(Profesor elemento) {
		getSession().update(elemento);	
	}
	@Override
	public List<Profesor> findAllProfesores() {
		return getSession().createQuery("from Profesor").list();
	}
	@Override
	public Profesor findById(Long codigoProfesor) {
		return (Profesor)getSession().get(Profesor.class,codigoProfesor);
	}
	@Override
	public Profesor findBynumeroPeriodos(int numeroPeriodos) {
		return (Profesor)getSession().get(Profesor.class,numeroPeriodos);
	}
	@Override
	public Profesor findByapellidos(String apellidos) {
		return (Profesor)getSession().get(Profesor.class,apellidos);
	}
	@Override
	public Profesor findBynombres(String nombres) {
		return (Profesor)getSession().get(Profesor.class,nombres);
	}
	@Override
	public Profesor findByfechaNacimiento(Date fechaNacimiento) {
		return (Profesor)getSession().get(Profesor.class,fechaNacimiento);
	}
}
