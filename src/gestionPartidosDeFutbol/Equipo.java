package gestionPartidosDeFutbol;

import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private ArrayList<Jugador> jugadores;
    private String entrenador;
    private String estadio;

    public Equipo(String nombreEquipo, String entrenador, String estadio) {
        this.nombreEquipo = nombreEquipo;
        this.entrenador = entrenador;
        this.estadio = estadio;
        jugadores = new ArrayList<>();
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public ArrayList<Jugador> mostrarJugadores() {
        return jugadores;
    }

    public void agregarJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    @Override
    public String toString() {
        return "\nInformación del equipo: \nNombreEquipo: " + getNombreEquipo() +
                "\nEntrenador: " + getEntrenador() +
                "\nEstadio: " + getEstadio() +
                "\nJugadores: " + mostrarJugadores();
    }
}
