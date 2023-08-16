package tarjetasDeCredito;

import java.time.LocalDate;

public class TarjetaDeCredito {
    private String emisor;
    private long cupo;
    private String numeroDeTarjeta;
    private int ccv;
    private LocalDate fechaDeVncimiento;

    public TarjetaDeCredito() {
    }

    public TarjetaDeCredito(String emisor, long cupo, String numeroDeTarjeta, int ccv, LocalDate fechaDeVncimiento) {
        this.emisor = emisor;
        this.cupo = cupo;
        this.numeroDeTarjeta = numeroDeTarjeta;
        this.ccv = ccv;
        this.fechaDeVncimiento = fechaDeVncimiento;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public long getCupo() {
        return cupo;
    }

    public void setCupo(long cupo) {
        this.cupo = cupo;
    }

    public String getNumeroDeTarjeta() {
        return numeroDeTarjeta;
    }

    public void setNumeroDeTarjeta(String numeroDeTarjeta) {
        this.numeroDeTarjeta = numeroDeTarjeta;
    }

    public int getCcv() {
        return ccv;
    }

    public void setCcv(int ccv) {
        this.ccv = ccv;
    }

    public LocalDate getFechaDeVncimiento() {
        return fechaDeVncimiento;
    }

    public void setFechaDeVncimiento(LocalDate fechaDeVncimiento) {
        this.fechaDeVncimiento = fechaDeVncimiento;
    }

    public void imprimir(){
        System.out.println("\nEmisor de la tarjeta: " + this.emisor +
                "\nCupo: " + this.cupo +
                "\nNúmero de tarjeta: " + this.numeroDeTarjeta +
                "\nCCV: " + this.ccv +
                "\nFecha de vencimiento: " +this.fechaDeVncimiento);
    }
}
