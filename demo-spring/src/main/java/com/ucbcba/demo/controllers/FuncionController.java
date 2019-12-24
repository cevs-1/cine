package com.ucbcba.demo.controllers;

import com.ucbcba.demo.entities.Funcion;
import com.ucbcba.demo.services.FuncionService;
import com.ucbcba.demo.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FuncionController {
    private FuncionService funcionService;
    private MovieService movieService;

    @Autowired
    public void setMovieService(MovieService movieService) {
        this.movieService = movieService;
    }


    @Autowired
    public void setFuncionService(FuncionService funcionService) { this.funcionService = funcionService;
    }

    @PostMapping("/funcion/save")
    public ResponseEntity<Funcion>  saveFuncion(@RequestBody Funcion funcion) {
        return new ResponseEntity<>(funcionService.saveFuncion(funcion), HttpStatus.OK);
    }

    @GetMapping("/funcion/get")
    public ResponseEntity<String> findFuncionById(@RequestParam("id") Integer id){
        return new ResponseEntity<>(funcionService.findFuncionById(id).toString(), HttpStatus.OK);
    }

    @DeleteMapping("/funcion/delete")
    public ResponseEntity<String> deleteCarteleraById(@RequestParam("id") Integer id) {
        funcionService.deleteFuncionById(id);
        return new ResponseEntity<>("Eliminado", HttpStatus.OK);
    }

    @GetMapping("/funcion/list")
    public ResponseEntity<String> findAllFuncion() {
        return new ResponseEntity<>(funcionService.findAllFuncion().toString(), HttpStatus.OK);
    }
}
