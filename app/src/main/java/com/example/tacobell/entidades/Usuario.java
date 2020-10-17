package com.example.tacobell.entidades;

public class Usuario {
    private Integer id;
    private String nombre;
    private String dpi;

    public Usuario(Integer id, String nombre, String dpi) {
        this.id = id;
        this.nombre = nombre;
        this.dpi = dpi;
    }

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

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }
}
