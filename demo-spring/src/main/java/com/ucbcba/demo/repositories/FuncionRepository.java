package com.ucbcba.demo.repositories;

import com.ucbcba.demo.entities.Funcion;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface FuncionRepository extends CrudRepository<Funcion, Integer> {
}
