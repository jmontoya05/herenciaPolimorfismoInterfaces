package tarjetasDeCredito;

import java.time.LocalDate;

public class Black extends TarjetaDeCredito{

    public Black() {
    }

    public Black(String emisor, long cupo, String numeroDeTarjeta, int ccv, LocalDate fechaDeVncimiento) {
        super(emisor, cupo, numeroDeTarjeta, ccv, fechaDeVncimiento);
    }
}
