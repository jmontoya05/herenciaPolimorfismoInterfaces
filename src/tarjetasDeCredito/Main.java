package tarjetasDeCredito;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Black tarjetaBlack = new Black("Visa",10000000L,"4569 8745 3214 5870", 987, LocalDate.of(2026, 8, 16));

        Dorada tarjetaDorada = new Dorada();
        tarjetaDorada.setEmisor("MasterCard");
        tarjetaDorada.setCupo(20000000L);
        tarjetaDorada.setNumeroDeTarjeta("4523 6985 1278 0369");
        tarjetaDorada.setCcv(526);
        tarjetaDorada.setFechaDeVncimiento(LocalDate.of(2027,1,1));

        Platinum tarjetaPlatinum = new Platinum("American Express", 1000000L, "564 89651 2364", 417, LocalDate.of(2024,8,16));

        Clasica tarjetaClasica = new Clasica();
        tarjetaClasica.setEmisor("MasterCard");
        tarjetaClasica.setCupo(50000000L);
        tarjetaClasica.setNumeroDeTarjeta("6320 0369 5621 7308");
        tarjetaClasica.setCcv(526);
        tarjetaClasica.setFechaDeVncimiento(LocalDate.of(2028,5,12));

        System.out.println("\nInformación tarjeta Black: ");
        tarjetaBlack.imprimir();

        System.out.println("\nInformación tarjeta Dorada: ");
        tarjetaDorada.imprimir();

        System.out.println("\nInformación tarjeta Platinum: ");
        tarjetaPlatinum.imprimir();

        System.out.println("\nInformación tarjeta Clásica: ");
        tarjetaClasica.imprimir();

    }
}
