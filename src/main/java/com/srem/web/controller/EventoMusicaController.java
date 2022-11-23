package com.srem.web.controller;

import com.srem.web.model.EventoMusica;
import com.srem.web.service.EventoMusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/evento"})
public class EventoMusicaController {

    @Autowired
    EventoMusicaService service;

    @GetMapping
    public List<EventoMusica> listarEventosMusica() {
        return service.listarEventosMusica();
    }

    @GetMapping(path = {"/{id}"})
    public EventoMusica obtenerEventoMusicaPorId(@PathVariable("id") int id) {
        return service.obtenerEventoMusicaPorId(id);
    }

    @GetMapping(path = {"/nombreevento/{nombreEvento}"})
    public EventoMusica obtenerUsuarioPerfil(@PathVariable("nombreEvento") String nombreEvento) {
        return service.obtenerEventoMusicaPorNombre(nombreEvento);
    }

}
