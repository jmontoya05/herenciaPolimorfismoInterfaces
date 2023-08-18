package inventarioLibros;

public class Main {
    public static void main(String[] args) {

        Libro aventura = new Libro("La flecha negra", "Robert Stevenson", 200000);
        Libro drama = new Libro("La divina comedia", "Dante Alighieri", 1000000);
        Libro historia = new Libro("La iliada", "Homero", 9000000);

        aventura.mostrarInformacion();
        drama.mostrarInformacion();
        historia.mostrarInformacion();
    }
}
