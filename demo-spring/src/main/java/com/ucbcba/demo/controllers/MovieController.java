package com.ucbcba.demo.controllers;

import com.ucbcba.demo.entities.Movie;
import com.ucbcba.demo.services.MovieService;
import com.ucbcba.demo.services.CarteleraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieController {

    private MovieService movieService;
    private CarteleraService carteleraService;

    @Autowired
    public void setCarteleraService(CarteleraService carteleraService) {
        this.carteleraService = carteleraService;
    }

    @Autowired
    public void setMovieService(MovieService movieService) {
        this.movieService = movieService;
    }


    @PostMapping("/movie/save")
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie) {
        return new ResponseEntity<>(movieService.saveMovie(movie), HttpStatus.OK);
    }

    @GetMapping("/movie/get")
    public ResponseEntity<String> findMovieById(@RequestParam("id") Integer id) {
        return new ResponseEntity<>(movieService.findMovieById(id).toString(), HttpStatus.OK);
    }
    @GetMapping("/movie/comments")
    public ResponseEntity<Iterable<Movie>> findAll() {
        return  new ResponseEntity<>(movieService.findAllMovies(), HttpStatus.OK);
    }
    @GetMapping("/movie/list")
    public ResponseEntity<String> findAllMovies() {
        return new ResponseEntity<>(movieService.findAllMovies().toString(), HttpStatus.OK);
    }
}
