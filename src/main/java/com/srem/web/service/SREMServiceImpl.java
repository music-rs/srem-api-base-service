package com.srem.web.service;

import com.srem.web.dao.ParametrosGeneralesDAO;
import com.srem.web.model.ParametrosGenerales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SREMServiceImpl implements SREMService {

    @Autowired
    ParametrosGeneralesDAO parametrosGeneralesRepository;

    @Override
    public List<ParametrosGenerales> listarParametrosGenerales() {
        // TODO Auto-generated method stub
        return parametrosGeneralesRepository.findAll();
    }

    @Override
    public ParametrosGenerales obtenerParametrosGeneralesPorCodigo(String codigo) {
        // TODO Auto-generated method stub
        return parametrosGeneralesRepository.findByCodigo(codigo);
    }


}
