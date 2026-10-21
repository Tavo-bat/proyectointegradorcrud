package co.edu.cesde.proyectointegradorcrud.repository;

import co.edu.cesde.proyectointegradorcrud.models.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository
    extends JpaRepository<Estudiante, Long>{


    Estudiante findByEstudianteId(Long estudianteId);

    void deleteByEstudianteId(Long estudianteId);
}
