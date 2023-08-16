package tarjetasDeCredito;

import java.time.LocalDate;

public class Platinum extends TarjetaDeCredito{

    public Platinum() {
    }

    public Platinum(String emisor, long cupo, String numeroDeTarjeta, int ccv, LocalDate fechaDeVncimiento) {
        super(emisor, cupo, numeroDeTarjeta, ccv, fechaDeVncimiento);
    }
}
