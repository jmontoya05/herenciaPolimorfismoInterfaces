package gestionVehiculos;

public class Main {

    public static void main(String[] args) {

        Automovil automovil1 = new Automovil(4,"Chavrolet", "Spark", 4, "Gasolina");
        Automovil automovil2 = new Automovil(4, "Toyota", "TXL", 6, "ACPM");

        Motocicleta motocileta1 = new Motocicleta(2,"AKT", "NKD", 125, "Manual");
        Motocicleta motocileta2 = new Motocicleta(2,"Yamaha", "N-MAX", 300, "Automática");

        Propietario propietario1 = new Propietario("Juan","Hernandez", automovil1);
        Propietario propietario2 = new Propietario("Daniela","Alvarez", automovil2);
        Propietario propietario3 = new Propietario("Rodrigo","Rios", motocileta1);
        Propietario propietario4 = new Propietario("Karen","Reyes", motocileta2);

        propietario1.mostrarInformacion();
        propietario2.mostrarInformacion();
        propietario3.mostrarInformacion();
        propietario4.mostrarInformacion();

        motocileta1.conducir();
        automovil1.conducir();

    }
}
