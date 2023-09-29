package gestionUniversidad;

import java.util.Arrays;

public class CursoVirtual extends Curso{
    private String plataforma;

    public CursoVirtual(String nombreCurso, Profesor profesor, String plataforma) {
        super(nombreCurso, profesor);
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String mostrarInformacion() {
        return "\nNombre curso: " + getNombreCurso() +
                "\nProfesor: " + getProfesor().getNombre() +
                "\nHorario: " + getPlataforma() +
                "\nParticipación: " + calcularParticipacionPromedio();
    }

    public double calcularParticipacionPromedio(){
        return getEstudiantes().size();
    }
}
