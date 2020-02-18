package com.laboratorio.core.service;

import java.util.List;

import com.laboratorio.core.model.Producto;

public interface IngresarProducto {
	void saveProducto(Producto elemento);
	void deleteProductoById(Long codigoProducto);
	void updateProducto(Producto elemento);
	List<Producto> findAllProductos();
	Producto findById(Long codigoProducto);
	Producto findByNombre(String nombre);
	Producto findByModelo(String modelo);
	Producto findBytipoInstrumento(String tipoInstrumento);
	Producto findByPrecio(Long precio);
	Producto findBygarantiaMeses(int garantiaMeses);
	Producto findBypaisProcedencia(String paisProcedencia);
}
