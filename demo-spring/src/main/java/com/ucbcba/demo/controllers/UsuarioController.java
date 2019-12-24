package com.ucbcba.demo.controllers;

import com.ucbcba.demo.entities.Usuario;
import com.ucbcba.demo.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {
    private UsuarioService usuarioService;

    @Autowired
    public void setUsuarioService(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/usuario/save")
    public ResponseEntity<Usuario> usuarioSave(@RequestBody Usuario usuario) {
        return new ResponseEntity<>(usuarioService.saveUsuario(usuario), HttpStatus.OK);
    }

    @PostMapping("/usuario/update")
    public ResponseEntity<Usuario> usuariUpdate(@RequestBody Usuario usuario) {
        return new ResponseEntity<>(usuarioService.saveUsuario(usuario), HttpStatus.OK);
    }

    @DeleteMapping("/usuario/delete")
    public ResponseEntity<String> usuarioDelete(@RequestParam("id") Integer id) {
        usuarioService.deleteUsuario(id);
        return new ResponseEntity<>("eliminado", HttpStatus.OK);
    }

    @GetMapping("/usuario/find")
    public ResponseEntity<String> usuarioFind(@RequestParam("id") Integer id) {
        String response;
        try {
            Usuario tmp = usuarioService.findById(id);
            response = tmp.toString();
        }catch (Exception e) {
            response = "{\"mensaje\": \"no se pudo encontrar el usuario con id: "+ id +"\"}";
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/usuario/findall")
    public ResponseEntity<Iterable<Usuario>> usuarioFindAll() {
        return new ResponseEntity<>(usuarioService.listaAll(), HttpStatus.OK);
    }


}
