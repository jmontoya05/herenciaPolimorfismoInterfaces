package gestionUniversidad;

public class CursoPresencial extends Curso{
    private String horario;

    public CursoPresencial(String nombreCurso, Profesor profesor, String horario) {
        super(nombreCurso, profesor);
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String mostrarInformacion() {
        return "\nNombre curso: " + getNombreCurso() +
                "\nProfesor: " + getProfesor().getNombre() +
                "\nHorario: " + getHorario() +
                "\nAsistencia: " + calcularAsistenciaPromedio();
    }

    public double calcularAsistenciaPromedio(){
        return getEstudiantes().size();
    }
}
