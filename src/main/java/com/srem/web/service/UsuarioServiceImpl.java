package com.srem.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srem.web.dao.UsuarioPerfilDAO;
import com.srem.web.model.UsuarioPerfil;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioPerfilDAO usuarioPerfilRepository;

	@Override
	public List<UsuarioPerfil> listarUsuarioPerfil() {
		// TODO Auto-generated method stub

		return usuarioPerfilRepository.findAll();

	}

	@Override
	public UsuarioPerfil obtenerUsuarioPerfil(int id) {
		// TODO Auto-generated method stub
		return usuarioPerfilRepository.findById(id);
	}

	@Override
	public UsuarioPerfil agregarUsuarioPerfil(UsuarioPerfil usuarioPerfil) {
		// TODO Auto-generated method stub
		return usuarioPerfilRepository.save(usuarioPerfil);
	}

	@Override
	public UsuarioPerfil modificarUsuarioPerfil(UsuarioPerfil usuarioPerfil) {
		// TODO Auto-generated method stub
		return usuarioPerfilRepository.save(usuarioPerfil);
	}

	@Override
	public UsuarioPerfil eliminarUsuarioPerfil(int id) {
		// TODO Auto-generated method stub

		UsuarioPerfil usuarioPerfil = obtenerUsuarioPerfil(id);

		if (usuarioPerfil != null) {
			usuarioPerfilRepository.delete(usuarioPerfil);
		}

		return usuarioPerfil;
	}

	@Override
	public UsuarioPerfil obtenerUsuarioPerfilPorNickAndPassword(String nick, String password) {
		// TODO Auto-generated method stub
		return usuarioPerfilRepository.findByNombreUsuarioAndPassword(nick, password);
	}
	
	@Override
	public UsuarioPerfil obtenerUsuarioPerfilPorEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		return usuarioPerfilRepository.findByEmailAndPassword(email, password);
	}

}
