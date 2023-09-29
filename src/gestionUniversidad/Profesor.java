package gestionUniversidad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Profesor extends Persona{
    private String titulo;
    private List<String> materias = new ArrayList<>();

    public Profesor(String nombre, int edad, String genero, String titulo) {
        super(nombre, edad, genero);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<String> getMaterias() {
        return materias;
    }

    public void setMateria(String materia) {
        materias.add(materia);
    }

    @Override
    public String mostrarInformacion() {
        return  "\nNombre: " + getNombre() +
                "\nEdad: " + getEdad() +
                "\nGenero: " + getGenero() +
                "\nTítulo: " + getTitulo() +
                "\nMaterias: " + getMaterias();
    }
}
