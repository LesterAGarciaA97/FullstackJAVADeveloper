package com.laboratorio.core.service;

import java.util.List;

import com.laboratorio.core.model.Producto;
import com.laboratorio.core.dao.ProductoDao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ingresarproducto")
@Transactional
public class IngresarProductoImpl implements IngresarProducto {
	@Autowired
	private ProductoDao ingresarproducto;
	@Override
	public void saveProducto(Producto elemento) {
		ingresarproducto.saveProducto(elemento);
	}
	@Override
	public void deleteProductoById(Long codigoProducto) {
		ingresarproducto.deleteProductoById(codigoProducto);
	}
	@Override
	public void updateProducto(Producto elemento) {
		ingresarproducto.updateProducto(elemento);
	}
	@Override
	public List<Producto> findAllProductos() {
		return ingresarproducto.findAllProductos();
	}
	@Override
	public Producto findById(Long codigoProducto) {
		return ingresarproducto.findById(codigoProducto);
	}
	@Override
	public Producto findByNombre(String nombre) {
		return ingresarproducto.findByNombre(nombre);
	}
	@Override
	public Producto findByModelo(String modelo) {
		return ingresarproducto.findByModelo(modelo);
	}
	@Override
	public Producto findBytipoInstrumento(String tipoInstrumento) {
		return ingresarproducto.findBytipoInstrumento(tipoInstrumento);
	}
	@Override
	public Producto findByPrecio(Long precio) {
		return ingresarproducto.findByPrecio(precio);
	}
	@Override
	public Producto findBygarantiaMeses(int garantiaMeses) {
		return ingresarproducto.findBygarantiaMeses(garantiaMeses);
	}
	@Override
	public Producto findBypaisProcedencia(String paisProcedencia) {
		return ingresarproducto.findBypaisProcedencia(paisProcedencia);
	}
}
