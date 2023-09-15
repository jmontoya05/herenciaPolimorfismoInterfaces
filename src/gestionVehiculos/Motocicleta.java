package gestionVehiculos;

public class Motocicleta extends Vehiculo implements Conducible{
    private final int cilindrada;
    private final String tipoManejo;

    public Motocicleta(int ruedas, String marca, String modelo, int cilindrada, String tipoManejo) {
        super(ruedas, marca, modelo);
        this.cilindrada = cilindrada;
        this.tipoManejo = tipoManejo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String getTipoManejo() {
        return tipoManejo;
    }

    @Override
    public void obtenerInformacion() {
        super.obtenerInformacion();
        System.out.println("Tipo vehiculo: Motocicleta" +
                "\nCilindrada " + this.getCilindrada() +
                "\nTipo de manejo: " + this.getTipoManejo());
    }

    @Override
    public void conducir() {
        System.out.println("La motocicleta se encuentra en movimiento");
    }
}
