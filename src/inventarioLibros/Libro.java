package inventarioLibros;

public class Libro implements Mostrable, Vendible{

    private final String titulo;
    private final String autor;
    private final double precio;

    public Libro(String titulo, String autor, double precio){
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    @Override
    public double obtenerPrecio(){
        return this.precio;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("\nTítulo: [" + this.titulo +
                "]\nAutor: [" + this.autor +
                "]\nPrecio: [" + this.obtenerPrecio() + "]\n");
    }
}
