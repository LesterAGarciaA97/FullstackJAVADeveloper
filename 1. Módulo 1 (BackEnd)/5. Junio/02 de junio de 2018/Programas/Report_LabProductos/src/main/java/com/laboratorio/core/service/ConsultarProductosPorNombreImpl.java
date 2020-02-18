package com.laboratorio.core.service;

import com.laboratorio.core.model.Producto;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("consultarproductospornombre")
@Transactional
public class ConsultarProductosPorNombreImpl implements ConsultarProductosPorNombre {
	@Autowired
	private ConsultarProductosPorNombre consultarproductospornombre;
	@Override
	public Producto findByNombre(String nombre) {
		return consultarproductospornombre.findByNombre(nombre);
	}
}