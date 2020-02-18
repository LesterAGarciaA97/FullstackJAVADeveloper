package com.laboratorio.core.service;

import com.laboratorio.core.model.Producto;

public interface ConsultarProductosPorNombre {
	Producto findByNombre(String nombre);
}
