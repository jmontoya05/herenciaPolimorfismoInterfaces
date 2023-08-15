package profesiones;

public class Profesion {
    private long sueldo;
    private long bono;

    public Profesion() {
        this.sueldo = 2000000;
    }

    public Profesion(long bono) {
        this.sueldo = 2000000;
        this.bono = bono;
    }

    public long getBono() {
        return bono;
    }

    public void setBono(long bono) {
        this.bono = bono;
    }

    public long calcularSueldo(){
        return this.sueldo + this.bono;
    }


}
