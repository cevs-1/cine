package com.ucbcba.demo.services;

import com.ucbcba.demo.entities.Funcion;

public interface FuncionService {

    Iterable findAllFuncion();
    Funcion findFuncionById(Integer id);
    Funcion saveFuncion(Funcion funcion); //insert o update
    void deleteFuncionById(Integer id);

}
