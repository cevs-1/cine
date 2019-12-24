package com.ucbcba.demo.repositories;

import com.ucbcba.demo.entities.Cartelera;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface CarteleraRepository extends CrudRepository<Cartelera, Integer> {
}
