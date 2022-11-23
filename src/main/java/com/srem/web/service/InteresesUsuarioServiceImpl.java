package com.srem.web.service;

import com.srem.web.dao.InteresesUsuarioDAO;
import com.srem.web.model.InteresesUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InteresesUsuarioServiceImpl implements InteresesUsuarioService {

    @Autowired
    InteresesUsuarioDAO interesesUsuarioRepository;

    @Override
    public List<InteresesUsuario> listarInteresesUsuario() {
        // TODO Auto-generated method stub
        return interesesUsuarioRepository.findAll();
    }

    @Override
    public InteresesUsuario obtenerInteresesUsuario(int id) {
        // TODO Auto-generated method stub
        return interesesUsuarioRepository.findById(id);
    }

    @Override
    public List<InteresesUsuario> obtenerInteresesUsuarioPorNombreUsuarioAndNombreEvento(String nombreUsuario, String nombreEvento) {
        // TODO Auto-generated method stub
        return interesesUsuarioRepository.findByNombreUsuarioAndNombreEvento(nombreUsuario, nombreEvento);
    }

    @Override
    public List<InteresesUsuario> obtenerInteresesUsuarioPorNombreUsuario(String nombreUsuario) {
        // TODO Auto-generated method stub
        return interesesUsuarioRepository.findByNombreUsuario(nombreUsuario);
    }

    @Override
    public List<InteresesUsuario> obtenerInteresesUsuarioPorIdUsuarioAndIdEvento(int idUsuario, int idEvento) {
        // TODO Auto-generated method stub
        return interesesUsuarioRepository.findByIdUsuarioAndIdEvento(idUsuario, idEvento);
    }

    @Override
    public List<InteresesUsuario> obtenerInteresesUsuarioPorIdUsuario(int idUsuario) {
        // TODO Auto-generated method stub
        return interesesUsuarioRepository.findByIdUsuario(idUsuario);
    }

    @Override
    public InteresesUsuario agregarInteresesUsuario(InteresesUsuario interesesUsuario) {
        // TODO Auto-generated method stub
        return interesesUsuarioRepository.save(interesesUsuario);
    }

    @Override
    public InteresesUsuario modificarInteresesUsuario(InteresesUsuario interesesUsuario) {
        // TODO Auto-generated method stub
        return interesesUsuarioRepository.save(interesesUsuario);
    }

}
