package com.srem.web.service;

import java.util.List;

import com.srem.web.model.InteresesUsuario;

public interface InteresesUsuarioService {

	List<InteresesUsuario> listarInteresesUsuario();

	InteresesUsuario obtenerInteresesUsuario(int id);

	List<InteresesUsuario> obtenerInteresesUsuarioPorNombreUsuarioAndNombreEvento(String nombreUsuario, String nombreEvento);

	List<InteresesUsuario> obtenerInteresesUsuarioPorNombreUsuario(String nombreUsuario);

	List<InteresesUsuario> obtenerInteresesUsuarioPorIdUsuarioAndIdEvento(int idUsuario, int idEvento);

	List<InteresesUsuario> obtenerInteresesUsuarioPorIdUsuario(int idUsuario);

	InteresesUsuario agregarInteresesUsuario(InteresesUsuario interesesUsuario);

	InteresesUsuario modificarInteresesUsuario(InteresesUsuario interesesUsuario);

}
