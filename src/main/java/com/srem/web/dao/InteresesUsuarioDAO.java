package com.srem.web.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.srem.web.model.InteresesUsuario;

public interface InteresesUsuarioDAO extends Repository<InteresesUsuario, Integer> {

	List<InteresesUsuario> findAll();

	InteresesUsuario findById(int id);
	
	List<InteresesUsuario> findByNombreUsuarioAndNombreEvento(String nombreUsuario,String nombreEvento);
	
	List<InteresesUsuario> findByNombreUsuario(String nombreUsuario);
	
	List<InteresesUsuario> findByIdUsuarioAndIdEvento(int idUsuario,int idEvento);
	
	List<InteresesUsuario> findByIdUsuario(int idUsuario);

	InteresesUsuario save(InteresesUsuario interesesUsuario);

}
