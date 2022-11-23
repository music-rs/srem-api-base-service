package com.srem.web.service;

import java.util.List;

import com.srem.web.model.UsuarioPerfil;

public interface UsuarioService {

	List<UsuarioPerfil> listarUsuarioPerfil();

	UsuarioPerfil obtenerUsuarioPerfil(int id);
	
	UsuarioPerfil obtenerUsuarioPerfilPorNickAndPassword(String nick, String password);
	
	UsuarioPerfil obtenerUsuarioPerfilPorEmailAndPassword(String email, String password);

	UsuarioPerfil agregarUsuarioPerfil(UsuarioPerfil usuarioPerfil);

	UsuarioPerfil modificarUsuarioPerfil(UsuarioPerfil usuarioPerfil);

	UsuarioPerfil eliminarUsuarioPerfil(int id);
}
