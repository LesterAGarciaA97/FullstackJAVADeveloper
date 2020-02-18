package com.kalum.core.dao;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.kalum.core.model.Curso;

@Repository
@Transactional
public class CursoDaoImpl extends AbstractSession implements CursoDao {
	@Override
	public void saveAlumno(Curso elemento) {
		getSession().persist(elemento);	
	}
	@Override
	public void deleteCursoById(Long codigoCurso) {
		Curso elemento = findById(codigoCurso);
		if(elemento != null) {
			getSession().delete(elemento);
		}	
	}
	@Override
	public void updateAlumno(Curso elemento) {
		getSession().update(elemento);	
	}
	@Override
	public List<Curso> findAllAlumnos() {
		return getSession().createQuery("from Curso").list();
	}
	@Override
	public Curso findById(Long codigoCurso) {
		return (Curso)getSession().get(Curso.class,codigoCurso);
	}
	@Override
	public Curso findByDescripcion(String descripcion) {
		return (Curso)getSession().get(Curso.class,descripcion);
	}
	@Override
	public Curso findBynumeroAlumnos(int numeroAlumnos) {
		return (Curso)getSession().get(Curso.class,numeroAlumnos);
	}
}
