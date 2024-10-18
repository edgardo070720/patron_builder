package com.example.patron_builder.Controllers;

import com.example.patron_builder.Domain.Asignatura;
import com.example.patron_builder.Domain.Estudiante;
import com.example.patron_builder.Domain.EstudianteBuilder;
import com.example.patron_builder.Domain.Programa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class EstudianteController {
    @GetMapping()
    public Estudiante getEstudiante() {
        Programa programa= new Programa("123","ing sistemas","ingenierias","UPC");
        List<Asignatura> asignaturas= new ArrayList<Asignatura>();
        Asignatura asignatura1= new Asignatura("SS300","ProgII",3,"jairo");
        Asignatura asignatura2= new Asignatura("SS3001","Estr",3,"Braulio");
        asignaturas.add(asignatura1);
        asignaturas.add(asignatura2);
        Estudiante estudiante= new Estudiante("1234","pepito","perez",24,9,programa,asignaturas);
        return estudiante;
    }

}
