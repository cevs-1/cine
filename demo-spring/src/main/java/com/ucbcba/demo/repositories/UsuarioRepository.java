package com.ucbcba.demo.repositories;

import com.ucbcba.demo.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface UsuarioRepository extends CrudRepository <Usuario, Integer> {
}
