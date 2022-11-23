package com.srem.web.dao;

import com.srem.web.model.EventoMusica;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface EventoMusicaDAO extends Repository<EventoMusica, Integer> {

    List<EventoMusica> findAllByOrderByIdAsc();

    EventoMusica findById(int id);

    EventoMusica findByNombreEvento(String nombreEvento);

}
