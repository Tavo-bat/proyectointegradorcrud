package co.edu.cesde.proyectointegradorcrud.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "estudiante")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long estudianteId;

    @Column(name = "nombre", nullable = false, length = 100)
    @NotNull
    @Size(max = 100)
    @NotEmpty
    private String nombre;

    @Column(name = "correo", nullable = false)
    @NotNull
    @Size(max = 100)
    @NotEmpty
    @Email
    private String correo;

    @Column(name = "teléfono")
    private String telefono;

    @Column(name = "activo", nullable = false)
    @NotNull
    private EstatusEstudiante activo;

    public Estudiante(){
    }

    public Estudiante(Long estudianteId, String nombre, String correo, String telefono) {
        this.estudianteId = estudianteId;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.activo = EstatusEstudiante.ACTIVO;
    }

    public Long getEstudianteId() {
        return estudianteId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public EstatusEstudiante getActivo() {
        return activo;
    }

    public void setActivo(EstatusEstudiante activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "estudiante=" + estudianteId +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", activo=" + activo +
                '}';
    }
}
