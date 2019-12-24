package com.ucbcba.demo.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Funcion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String schedule;
    private String room;
    @OneToOne(optional = false)
    @JoinColumn(name = "movie_id")
    private Movie movie;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getSchedule() {
        return schedule;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getRoom() {
        return room;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public Movie getMovie() { return movie; }

    public void setMovie(Movie movie) {  this.movie = movie;  }

    @Override
    public String toString() {
        return "{" +
                "\"id\": " + id +
                ", \"schedule\": \"" + schedule + '\"' +
                ", \"room\": \"" + room + '\"' +
                ", \"movie_id\": " + movie.getId() +
                "}";
    }
}
