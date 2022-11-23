package com.srem.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srem.web.dao.EventoMusicaDAO;
import com.srem.web.model.EventoMusica;

@Service
public class EventoMusicaServiceImpl implements EventoMusicaService {

	@Autowired
	EventoMusicaDAO eventoMusicaRepository;

	@Override
	public List<EventoMusica> listarEventosMusica() {
		// TODO Auto-generated method stub
		return eventoMusicaRepository.findAllByOrderByIdAsc();
	}

	@Override
	public EventoMusica obtenerEventoMusicaPorId(int id) {
		// TODO Auto-generated method stub
		return eventoMusicaRepository.findById(id);
	}

	@Override
	public EventoMusica obtenerEventoMusicaPorNombre(String nombreEvento) {
		// TODO Auto-generated method stub
		return eventoMusicaRepository.findByNombreEvento(nombreEvento);
	}

}
