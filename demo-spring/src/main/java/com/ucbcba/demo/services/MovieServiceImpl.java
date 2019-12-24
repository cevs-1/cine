package com.ucbcba.demo.services;

import com.ucbcba.demo.entities.Movie;
import com.ucbcba.demo.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;

    @Autowired
    @Qualifier("movieRepository")
    public void setMovieRepository(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Iterable<Movie> findAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie findMovieById(Integer id) {
        return movieRepository.findById(id).get();
    }

    @Override
    public void deleteMovieById(Integer id) {
        movieRepository.deleteById(id);
    }
}
