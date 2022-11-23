package com.srem.web.service;

import java.util.List;

import com.srem.web.model.ParametrosGenerales;

public interface SREMService {

	List<ParametrosGenerales> listarParametrosGenerales();
	
	ParametrosGenerales obtenerParametrosGeneralesPorCodigo(String codigo);

}
