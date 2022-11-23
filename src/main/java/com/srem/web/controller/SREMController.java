package com.srem.web.controller;

import com.srem.web.model.ParametrosGenerales;
import com.srem.web.service.SREMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/sistema"})
public class SREMController {

    @Autowired
    SREMService service;

    @GetMapping
    public List<ParametrosGenerales> listarParametrosGenerales() {
        return service.listarParametrosGenerales();
    }

    @GetMapping(path = {"/{codigo}"})
    public ParametrosGenerales obtenerUsuarioPerfil(@PathVariable("codigo") String codigo) {
        return service.obtenerParametrosGeneralesPorCodigo(codigo);
    }

}
