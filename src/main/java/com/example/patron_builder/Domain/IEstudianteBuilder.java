package com.example.patron_builder.Domain;

public interface IEstudianteBuilder {
    void id(String id);
    void nombre(String nombre);
    void apellido(String apellido);
    void edad(int edad);
    void semestre(int semestre);
    void programa(String id,String nombre,String facultad,String university);
    void asignatura(String id, String nombre,int creditos, String docente);
    Estudiante build();
}
