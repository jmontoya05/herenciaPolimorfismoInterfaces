package profesiones;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Ingeniero civil = new Ingeniero(5000000);
        Arquitecto restaurador = new Arquitecto();
        restaurador.setBono(2000000);
        Medico cirujano = new Medico(3000000);

        System.out.println("El sueldo del ingeniero es de " + civil.calcularSueldo());
        System.out.println("El sueldo del arquitecto es de " + restaurador.calcularSueldo());
        System.out.println("El sueldo del médico es de " + cirujano.calcularSueldo());

    }
}
