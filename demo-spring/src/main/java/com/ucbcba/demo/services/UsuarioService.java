package com.ucbcba.demo.services;

import com.ucbcba.demo.entities.Usuario;

public interface UsuarioService {
    Iterable <Usuario> listaAll();
    Usuario saveUsuario(Usuario usuario);
    void deleteUsuario(Integer id);
    Usuario updateUsuario(Usuario usuario);
    Usuario findById(Integer id);
}
