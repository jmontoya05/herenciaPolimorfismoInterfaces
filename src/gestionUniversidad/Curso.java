package gestionUniversidad;

import java.util.ArrayList;
import java.util.List;

public abstract class Curso {
    private String nombreCurso;
    private Profesor profesor;
    private List<Estudiante> estudiantes = new ArrayList<>();

    public Curso(String nombreCurso, Profesor profesor) {
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public abstract String mostrarInformacion();
}
