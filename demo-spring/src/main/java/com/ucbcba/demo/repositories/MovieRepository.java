package com.ucbcba.demo.repositories;

import com.ucbcba.demo.entities.Movie;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface MovieRepository extends CrudRepository<Movie, Integer> {
}
