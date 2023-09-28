package gestionPartidosDeFutbol;

import java.util.ArrayList;

public class Jugador {
    private String nombreJugador;
    private int edad;
    private String posicion;
    private ArrayList<String> habilidades;
    private int numeroCamiseta;

    public Jugador(String nombreJugador, int edad, String posicion, int numeroCamiseta) {
        this.nombreJugador = nombreJugador;
        this.edad = edad;
        this.posicion = posicion;
        this.numeroCamiseta = numeroCamiseta;
        habilidades = new ArrayList<>();
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public ArrayList<String> mostrarHabilidades() {
        return habilidades;
    }

    public void agregarHabilidad(String habilidad) {
        this.habilidades.add(habilidad);
    }

    @Override
    public String toString() {
        return "\nNombre del jugador: " + getNombreJugador() +
                "\nEdad: " + getEdad() +
                "\nPosición: " + getPosicion() +
                "\nNúmero de camiseta: " + getNumeroCamiseta() +
                "\nHabilidades" + mostrarHabilidades();
    }
}
