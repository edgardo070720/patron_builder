package com.example.patron_builder.Domain;

import java.util.ArrayList;
import java.util.List;

public class EstudianteBuilder implements IEstudianteBuilder{
    private String id;
    private String nombre;
    private String apellido;
    private int edad;
    private int semestre;
    private  Programa programa;
    private List<Asignatura> asignaturas;

    public EstudianteBuilder() {
        this.asignaturas = new ArrayList<Asignatura>();
    }

    @Override
    public void id(String id) {
        this.id = id;
    }

    @Override
    public void nombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void apellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public void edad(int edad) {
        this.edad = edad;
    }

    @Override
    public void semestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public void programa(String id, String nombre, String facultad, String university) {
        this.programa = new Programa(id, nombre, facultad, university);
    }

    @Override
    public void asignatura(String id, String nombre, int creditos, String docente) {
        asignaturas.add(new Asignatura(id, nombre, creditos, docente));
    }

    @Override
    public Estudiante build() {
        return new Estudiante(this.id,this.nombre,this.apellido,this.edad,this.semestre,this.programa,this.asignaturas);

    }
}
