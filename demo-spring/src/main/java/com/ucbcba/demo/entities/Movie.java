package com.ucbcba.demo.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String content;
    @ManyToOne(optional = false)
    @JoinColumn(name = "cartelera_id")
    private Cartelera cartelera;
    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private Set<Funcion> funcion;

    public Movie() { funcion = new HashSet<>(); }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Cartelera getCartelera() {
        return cartelera;
    }

    public void setCartelera(Cartelera cartelera) {  this.cartelera = cartelera;  }

    public Set<Funcion> getFuncion() { return funcion; }

    public void setFuncion(Set<Funcion> funcion) {
        this.funcion = funcion;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\": " + id +
                ", \"title\": \"" + title + '\"' +
                ", \"content\": \"" + content + '\"' +
                ", \"cartelera_id\": " + cartelera.getId() +
                ", \"funcion\": " + funcion.toString() +
                "}";
    }
}
