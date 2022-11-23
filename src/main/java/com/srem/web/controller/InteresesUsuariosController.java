package com.srem.web.controller;

import com.srem.web.model.InteresesUsuario;
import com.srem.web.service.InteresesUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/interesUsuario"})
public class InteresesUsuariosController {

    @Autowired
    InteresesUsuarioService service;

    @GetMapping
    public List<InteresesUsuario> listarInteresesUsuario() {
        return service.listarInteresesUsuario();
    }

    @PostMapping
    public InteresesUsuario agregarInteresesUsuario(@RequestBody InteresesUsuario interesesUsuario) {
        return service.agregarInteresesUsuario(interesesUsuario);
    }

    @GetMapping(path = {"/obtenerInteres"})
    public InteresesUsuario obtenerInteresesUsuario(@RequestParam("id") String id) {
        return service.obtenerInteresesUsuario(Integer.parseInt(id));
    }

    @GetMapping(path = {"/obtenerInteres/nombreUsuario"})
    public List<InteresesUsuario> obtenerInteresesUsuarioPorNombreUsuario(@RequestParam("nombreUsuario") String nombreUsuario) { // @RequestParam String id --> ?id=xxxx
        return service.obtenerInteresesUsuarioPorNombreUsuario(nombreUsuario);
    }

    @GetMapping(path = {"/obtenerInteres/nombreUsuarioEvento"})
    public List<InteresesUsuario> obtenerInteresesUsuarioPorNombreUsuarioAndNombreEvento(@RequestParam("nombreUsuario") String nombreUsuario, @RequestParam("nombreEvento") String nombreEvento) {
        return service.obtenerInteresesUsuarioPorNombreUsuarioAndNombreEvento(nombreUsuario, nombreEvento);
    }

    @GetMapping(path = {"/obtenerInteres/idUsuario"})
    public List<InteresesUsuario> obtenerInteresesUsuarioPorIdUsuario(@RequestParam("idUsuario") String idUsuario) {
        return service.obtenerInteresesUsuarioPorIdUsuario(Integer.parseInt(idUsuario));
    }

    @GetMapping(path = {"/obtenerInteres/idUsuarioEvento"})
    public List<InteresesUsuario> obtenerInteresesUsuarioPorIdUsuarioAndIdEvento(@RequestParam("idUsuario") String idUsuario, @RequestParam("idEvento") String idEvento) { // @RequestParam
        // String id -->
        // ?id=xxxx
        return service.obtenerInteresesUsuarioPorIdUsuarioAndIdEvento(Integer.parseInt(idUsuario), Integer.parseInt(idEvento));
    }

    @PutMapping(path = {"/{id}"})
    public InteresesUsuario modificarInteresesUsuario(@RequestBody InteresesUsuario interesesUsuario, @PathVariable("id") int id) {
        interesesUsuario.setId(id);
        return service.modificarInteresesUsuario(interesesUsuario);
    }

}
