package com.ucbcba.demo.controllers;

import com.ucbcba.demo.entities.Cartelera;
import com.ucbcba.demo.services.CarteleraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class CarteleraController {

    private CarteleraService carteleraService;

    @Autowired
    public void setCarteleraService(CarteleraService carteleraService) { this.carteleraService = carteleraService;
    }

    @PostMapping("/cartelera/save")
    public ResponseEntity<Cartelera>  saveCartelera(@RequestBody Cartelera cartelera) {
        try
        {
            return new ResponseEntity<>(carteleraService.saveCartelera(cartelera), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new Cartelera(), HttpStatus.OK);
    }

    @GetMapping("/cartelera/get")
    public ResponseEntity<String> findCarteleraById(@RequestParam("id") Integer id){
        return new ResponseEntity<>(carteleraService.findCarteleraById(id).toString(), HttpStatus.OK);
    }

    @DeleteMapping("/cartelera/delete")
    public ResponseEntity<String> deleteCarteleraById(@RequestParam("id") Integer id) {
        carteleraService.deleteCarteleraById(id);
        return new ResponseEntity<>("Eliminado", HttpStatus.OK);
    }

    @GetMapping("/cartelera/list")
    public ResponseEntity<String> findAllCarteleras() {
        return new ResponseEntity<>(carteleraService.findAllCarteleras().toString(), HttpStatus.OK);
    }
}
