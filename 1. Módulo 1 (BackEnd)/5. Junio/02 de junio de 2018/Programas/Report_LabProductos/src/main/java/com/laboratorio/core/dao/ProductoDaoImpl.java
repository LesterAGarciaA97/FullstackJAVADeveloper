package com.laboratorio.core.dao;

import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import com.laboratorio.core.model.Producto;

public class ProductoDaoImpl extends AbstractSession implements ProductoDao{
	@Override
	public void saveProducto(Producto elemento) {
		getSession().save(elemento);	
	}
	@Override
	public void deleteProductoById(Long codigoProducto) {
		Producto elemento = findById(codigoProducto);
		if(elemento != null) {
			getSession().delete(elemento);
		}
	}
	@Override
	public void updateProducto(Producto elemento) {
		getSession().update(elemento);	
	}
	@Override
	public List<Producto> findAllProductos() {
		return getSession().createQuery("from Producto").list();
	}
	@Override
	public Producto findById(Long codigoProducto) {
		return (Producto)getSession().get(Producto.class,codigoProducto);
	}
	@Override
	public Producto findByNombre(String nombre) {
		return (Producto)getSession().get(Producto.class,nombre);
	}
	@Override
	public Producto findByModelo(String modelo) {
		return (Producto)getSession().get(Producto.class,modelo);
	}
	@Override
	public Producto findBytipoInstrumento(String tipoInstrumento) {
		return (Producto)getSession().get(Producto.class,tipoInstrumento);
	}
	@Override
	public Producto findByPrecio(Long precio) {
		return (Producto)getSession().get(Producto.class,precio);
	}
	@Override
	public Producto findBygarantiaMeses(int garantiaMeses) {
		return (Producto)getSession().get(Producto.class,garantiaMeses);
	}
	@Override
	public Producto findBypaisProcedencia(String paisProcedencia) {
		return (Producto)getSession().get(Producto.class,paisProcedencia);
	}
}
