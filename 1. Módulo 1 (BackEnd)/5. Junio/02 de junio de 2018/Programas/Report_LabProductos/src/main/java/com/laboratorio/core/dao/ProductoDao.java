package com.laboratorio.core.dao;

import java.util.List;

import com.laboratorio.core.model.Producto;

public interface ProductoDao {
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
