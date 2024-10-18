package com.example.patron_builder.Domain;

public class Programa {
    private String id;
    private String name;
    private String facultad;
    private String university;

    public Programa(String id, String name, String facultad, String university) {
        this.id = id;
        this.name = name;
        this.facultad = facultad;
        this.university = university;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Programa{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", facultad='" + facultad + '\'' +
                ", university='" + university + '\'' +
                '}';
    }
}
