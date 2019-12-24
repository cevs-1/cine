package com.ucbcba.demo.services;

import com.ucbcba.demo.entities.Cartelera;

public interface CarteleraService {

    Iterable<Cartelera> findAllCarteleras();
    Cartelera findCarteleraById(Integer id);
    Cartelera saveCartelera(Cartelera cartelera); //insert o update
    void deleteCarteleraById(Integer id);

}
