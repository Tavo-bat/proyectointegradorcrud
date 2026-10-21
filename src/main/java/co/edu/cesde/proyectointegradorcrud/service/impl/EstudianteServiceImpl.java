package co.edu.cesde.proyectointegradorcrud.service.impl;

import co.edu.cesde.proyectointegradorcrud.models.Estudiante;
import co.edu.cesde.proyectointegradorcrud.repository.EstudianteRepository;
import co.edu.cesde.proyectointegradorcrud.service.EstudianteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    private EstudianteRepository estudianteRepository;

    public EstudianteServiceImpl(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }


    @Override
    public List<Estudiante> findAll() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante findByEstudianteId(Long estudianteId) {
        Estudiante estudiante = estudianteRepository.findByEstudianteId(estudianteId);
        if (estudiante=!null){
            return estudiante;
        }
        return null;
    }

    @Override
    public Estudiante save(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public void deleteByEstudianteId(Long estudianteId) {
        estudianteRepository.deleteByEstudianteId(estudianteId);
    }

    @Override
    public Estudiante update(Estudiante estudiante) {
        if (estudiante != null){
            return estudianteRepository.save(estudiante);
        }
        return null;
    }

    @Override
    public Estudiante patch(Estudiante estudiante) {
        if (estudiante != null){
            return estudianteRepository.save(estudiante);
        }
        return null;
    }
}
