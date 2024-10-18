package com.example.patron_builder.Domain;

public class Asignatura {
    private String id;
    private String nombre;
    private int noCreditos;
    private String docente;

    public Asignatura(String id, String nombre, int noCreditos, String docente) {
        this.id = id;
        this.nombre = nombre;
        this.noCreditos = noCreditos;
        this.docente = docente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNoCreditos() {
        return noCreditos;
    }

    public void setNoCreditos(int noCreditos) {
        this.noCreditos = noCreditos;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", noCreditos=" + noCreditos +
                ", docente='" + docente + '\'' +
                '}';
    }
}
