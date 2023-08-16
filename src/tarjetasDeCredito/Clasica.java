package tarjetasDeCredito;

import java.time.LocalDate;

public class Clasica extends TarjetaDeCredito{

    public Clasica() {
    }

    public Clasica(String emisor, long cupo, String numeroDeTarjeta, int ccv, LocalDate fechaDeVncimiento) {
        super(emisor, cupo, numeroDeTarjeta, ccv, fechaDeVncimiento);
    }
}
