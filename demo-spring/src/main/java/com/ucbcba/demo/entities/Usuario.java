package com.ucbcba.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
    @Id
    private Integer id;

    private String nombre;

    private String apellido;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "{\"Usuario\": {" +
                "\"id\"=" + id +
                ", \"nombre\"=' \"" + nombre + '\"' +
                ", \"apellido\"=' \"" + apellido + '\"' +
                "}}";
    }
}
