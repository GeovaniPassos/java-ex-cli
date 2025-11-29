package com.devgeovani.exemplomap.model;

public class Categorias {

    private Long id;
    private String name;

    public Categorias(String name) {
        this.name = name;
    }

    public Categorias() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
