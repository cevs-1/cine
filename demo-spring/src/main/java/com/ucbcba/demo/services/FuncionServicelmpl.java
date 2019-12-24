package com.ucbcba.demo.services;

import com.ucbcba.demo.entities.Funcion;
import com.ucbcba.demo.repositories.FuncionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FuncionServicelmpl implements FuncionService{
    private FuncionRepository funcionRepository;

    @Autowired
    @Qualifier(value = "funcionRepository")
    public void setPostRepository(FuncionRepository funcionRepository) {
        this.funcionRepository = funcionRepository;
    }

    @Override
    public Iterable<Funcion> findAllFuncion() {
        return funcionRepository.findAll();
    }

    @Override
    public Funcion findFuncionById(Integer id) {
        return funcionRepository.findById(id).get();
    }

    @Override
    public Funcion saveFuncion(Funcion funcion) {
        return funcionRepository.save(funcion);
    }

    @Override
    public void deleteFuncionById(Integer id) {
        funcionRepository.deleteById(id);
    }
}
