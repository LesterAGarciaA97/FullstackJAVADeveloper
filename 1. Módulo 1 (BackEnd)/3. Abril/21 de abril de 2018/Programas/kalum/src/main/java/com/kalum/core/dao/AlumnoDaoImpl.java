package com.kalum.core.dao;
import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.kalum.core.model.Alumno;

@Repository
@Transactional
public class AlumnoDaoImpl extends AbstractSession implements AlumnoDao {
	@Override
	public void saveAlumno(Alumno elemento) {
		getSession().save(elemento);	
	}
	@Override
	public void deleteCarreraById(Long codigoAlumno) {
		Alumno elemento = findById(codigoAlumno);
		if(elemento != null) {
			getSession().delete(elemento);
		}
	}
	@Override
	public void updateAlumno(Alumno elemento) {
		getSession().update(elemento);
	}
	@Override
	public List<Alumno> findAllAlumnos() {
		return getSession().createQuery("from Alumno").list();
	}
	@Override
	public Alumno findById(Long codigoAlumno) {
		return (Alumno)getSession().get(Alumno.class,codigoAlumno);
	}
	@Override
	public Alumno findByCarne(String carne) {
		return (Alumno)getSession().get(Alumno.class,carne);
	}
	@Override
	public Alumno findByapellidos(String apellidos) {
		return (Alumno)getSession().get(Alumno.class,apellidos);
	}
	@Override
	public Alumno findBynombres(String nombres) {
		return (Alumno)getSession().get(Alumno.class,nombres);
	} 
	@Override
	public Alumno findByfechaNacimiento(Date fechaNacimiento) {
		return (Alumno)getSession().get(Alumno.class,fechaNacimiento);
	} 
}
