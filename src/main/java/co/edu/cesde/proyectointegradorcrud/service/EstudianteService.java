package co.edu.cesde.proyectointegradorcrud.service;

import co.edu.cesde.proyectointegradorcrud.models.Estudiante;

import java.util.List;

public interface EstudianteService {

    List<Estudiante> findAll();
    Estudiante findByEstudianteId(Long estudianteId);
    Estudiante save(Estudiante estudiante);
    void deleteByEstudianteId(Long estudianteId);
    Estudiante update(Estudiante estudiante);
    Estudiante patch (Estudiante estudiante);
}
