package com.ucbcba.demo.services;

import com.ucbcba.demo.entities.Movie;

public interface MovieService {

    Iterable<Movie> findAllMovies();
    Movie saveMovie(Movie movie);
    Movie findMovieById(Integer id);
    void deleteMovieById(Integer id);
}
