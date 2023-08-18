package musica;

public class ReproductorMP3 implements ReproductorMusica{

    private final String nombre;
    private String estado;

    public ReproductorMP3(String nombre) {
        this.nombre = nombre;
        this.estado = "detenida";
    }

    public String getNombre() {
        return "\n" + this.nombre;
    }

    @Override
    public void reproducirMusica() {
        if (this.estado.equals("reproduciendo")){
            System.out.println("La música ya se estaba reproduciendo");
        } else {
            System.out.println("La música ahora se está reproduciendo");
            this.estado = "reproduciendo";
        }
    }

    @Override
    public void pausarMusica() {
        if (this.estado.equals("detenida")){
            System.out.println("No se puede pausar porque la música está detenida");
        } else if (this.estado.equals("pausada")){
            System.out.println("La música ya estaba pausada");
        } else {
            System.out.println("La música ahora está pausada");
            this.estado = "pausada";
        }
    }

    @Override
    public void detenerMusica() {
        if (this.estado.equals("detenida")){
            System.out.println("La música ya estaba detenida");
        } else {
            System.out.println("Se detuvo la música");
            this.estado = "detenida";
        }
    }
}
