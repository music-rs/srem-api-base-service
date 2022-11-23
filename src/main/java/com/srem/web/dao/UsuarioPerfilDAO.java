package com.srem.web.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.srem.web.model.UsuarioPerfil;

public interface UsuarioPerfilDAO extends Repository<UsuarioPerfil, Integer> {

	List<UsuarioPerfil> findAll();

	UsuarioPerfil findById(int id);
	
	UsuarioPerfil findByNombreUsuarioAndPassword(String nombreUsuario,String password);
	
	UsuarioPerfil findByEmailAndPassword(String email,String password);

	UsuarioPerfil save(UsuarioPerfil usuarioPerfil);

	void delete(UsuarioPerfil usuarioPerfil);
}
