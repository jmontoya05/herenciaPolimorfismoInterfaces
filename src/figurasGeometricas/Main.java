package figurasGeometricas;

public class Main {

    public static void main(String[] args) {

        Cuadrado figuraCuadro = new Cuadrado(5);
        Triangulo figuraTriangulo = new Triangulo(10, 8, 6);
        Circulo figuraCirculo = new Circulo(6);

        System.out.println("\nDatos del cuadrado:\nArea: " + figuraCuadro.calcularArea() +
                "\nPerimetro: " + figuraCuadro.calcularPerimetro() +
                "\nLados: " + figuraCuadro.calcularLados());

        System.out.println("\nDatos del circulo:\nArea: " + figuraCirculo.calcularArea() +
                "\nPerimetro: " + figuraCirculo.calcularPerimetro() +
                "\nLados: " + figuraCirculo.calcularLados());

        System.out.println("\nDatos del triangulo:\nArea: " + figuraTriangulo.calcularArea() +
                "\nPerimetro: " + figuraTriangulo.calcularPerimetro() +
                "\nLados: " + figuraTriangulo.calcularLados());
    }


}
