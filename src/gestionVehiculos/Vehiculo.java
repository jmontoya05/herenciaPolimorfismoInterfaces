package gestionVehiculos;

public class Vehiculo {
    private final int ruedas;
    private final String marca;
    private final String modelo;

    public Vehiculo(int ruedas, String marca, String modelo) {
        this.ruedas = ruedas;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getRuedas() {
        return ruedas;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void obtenerInformacion() {
        System.out.println("Información del vehiculo: \nMarca: " + this.getMarca() +
                "\nModelo: " + this.getModelo() +
                "\nNúmero de ruedas: " + this.getRuedas());
    }
}
