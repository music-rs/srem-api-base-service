package com.srem.web.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.srem.web.model.ParametrosGenerales;

public interface ParametrosGeneralesDAO extends Repository<ParametrosGenerales, Integer> {

	List<ParametrosGenerales> findAll();
	ParametrosGenerales findByCodigo(String codigo);

}
