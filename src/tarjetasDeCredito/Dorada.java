package tarjetasDeCredito;

import java.time.LocalDate;

public class Dorada extends TarjetaDeCredito {

    public Dorada() {
    }

    public Dorada(String emisor, long cupo, String numeroDeTarjeta, int ccv, LocalDate fechaDeVncimiento) {
        super(emisor, cupo, numeroDeTarjeta, ccv, fechaDeVncimiento);
    }
}