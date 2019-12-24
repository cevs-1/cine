package com.ucbcba.demo.services;

import com.ucbcba.demo.entities.Cartelera;
import com.ucbcba.demo.repositories.CarteleraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CarteleraServiceImpl implements CarteleraService {

    private CarteleraRepository carteleraRepository;

    @Autowired
    @Qualifier(value = "carteleraRepository")
    public void setCarteleraRepository(CarteleraRepository carteleraRepository) {
        this.carteleraRepository = carteleraRepository;
    }

    @Override
    public Iterable<Cartelera> findAllCarteleras() {
        return carteleraRepository.findAll();
    }

    @Override
    public Cartelera findCarteleraById(Integer id) {
        return carteleraRepository.findById(id).get();
    }

    @Override
    public Cartelera saveCartelera(Cartelera cartelera) {
        return carteleraRepository.save(cartelera);
    }

    @Override
    public void deleteCarteleraById(Integer id) {
        carteleraRepository.deleteById(id);
    }
}