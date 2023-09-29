package gestionUniversidad;

import java.util.Arrays;

public class Estudiante extends Persona implements Estadisticas{
    private String carnet;
    private double[] notas = new double[3];

    public Estudiante(String nombre, int edad, String genero, String carnet) {
        super(nombre, edad, genero);
        this.carnet = carnet;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    @Override
    public double calcularPromedio() {
        double sumatoria = 0;
        for (double nota : notas) {
            sumatoria += nota;
        }
        return sumatoria / notas.length;
    }

    @Override
    public double calcularMaximo() {
        double maximaNota = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maximaNota){
                maximaNota = notas[i];
            }
        }
        return maximaNota;
    }

    @Override
    public double calcularMinimo() {
        double minimaNota = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < minimaNota){
                minimaNota = notas[i];
            }
        }
        return minimaNota;
    }

    @Override
    public String mostrarInformacion() {
        return  "\nNombre: " + getNombre() +
                "\nEdad: " + getEdad() +
                "\nGenero: " + getGenero() +
                "\nCarnet: " + getCarnet() +
                "\nNotas: " + Arrays.toString(getNotas());
    }
}
