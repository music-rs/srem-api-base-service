package com.srem.web.service;

import java.util.List;

import com.srem.web.model.EventoMusica;

public interface EventoMusicaService {

	List<EventoMusica> listarEventosMusica();

	EventoMusica obtenerEventoMusicaPorId(int id);
	
	EventoMusica obtenerEventoMusicaPorNombre(String nombreEvento);

}
