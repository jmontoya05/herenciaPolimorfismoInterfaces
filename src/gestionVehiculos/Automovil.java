package gestionVehiculos;

public class Automovil extends Vehiculo implements Conducible{
    private final int numeroPuertas;
    private final String tipoCombustible;

    public Automovil(int ruedas, String marca, String modelo, int numeroPuertas, String tipoCombustible) {
        super(ruedas, marca, modelo);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    @Override
    public void obtenerInformacion() {
        super.obtenerInformacion();
        System.out.println("Tipo vehiculo: Automovil" +
                "\nNúmero de puertas: " + this.getNumeroPuertas() +
                "\nTipo combustible: " + this.getTipoCombustible());
    }

    @Override
    public void conducir() {
        System.out.println("El vehiculo se encuentra en movimiento");
    }
}
