package com.ucbcba.demo.entities;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Cartelera {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @OneToMany(mappedBy = "cartelera", cascade = CascadeType.ALL)
    private Set<Movie> movies;

    public Cartelera() {
        movies = new HashSet<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\": " + id +
                ", \"movies\": " + movies.toString() +
                "}";
    }
}
