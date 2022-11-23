package com.srem.web.controller;

import com.srem.web.model.UsuarioPerfil;
import com.srem.web.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/usuario"})
public class UsuarioController {

    @Autowired
    UsuarioService service;

    @GetMapping
    public List<UsuarioPerfil> listarUsuarioPerfil() {
        return service.listarUsuarioPerfil();
    }

    @PostMapping
    public UsuarioPerfil agregarUsuarioPerfil(@RequestBody UsuarioPerfil usuarioPerfil) {
        return service.agregarUsuarioPerfil(usuarioPerfil);
    }

    @PostMapping(path = {"/auth"})
    public UsuarioPerfil autenticarUsuarioPerfil(@RequestBody UsuarioPerfil usuarioPerfil) {

        UsuarioPerfil usuarioPerfilTemp;

        usuarioPerfilTemp = service.obtenerUsuarioPerfilPorNickAndPassword(usuarioPerfil.getNombreUsuario(), usuarioPerfil.getPassword());

        System.out.println("**************AUTH************");
        System.out.println("***1 NICK***:" + usuarioPerfilTemp);
        if (usuarioPerfilTemp == null) {
            usuarioPerfilTemp = service.obtenerUsuarioPerfilPorEmailAndPassword(usuarioPerfil.getNombreUsuario(), usuarioPerfil.getPassword());
            System.out.println("***2 EMAIL***:" + usuarioPerfilTemp);
        }

        return usuarioPerfilTemp;
    }

    @GetMapping(path = {"/{id}"})
    public UsuarioPerfil obtenerUsuarioPerfil(@PathVariable("id") int id) { // @RequestParam String id --> ?id=xxxx
        return service.obtenerUsuarioPerfil(id);
    }

    @PutMapping(path = {"/{id}"})
    public UsuarioPerfil modificarUsuarioPerfil(@RequestBody UsuarioPerfil usuarioPerfil, @PathVariable("id") int id) {
        usuarioPerfil.setId(id);
        return service.modificarUsuarioPerfil(usuarioPerfil);
    }

    @DeleteMapping(path = {"/{id}"})
    public UsuarioPerfil eliminarUsuarioPerfil(@PathVariable("id") int id) {
        return service.eliminarUsuarioPerfil(id);
    }
}
