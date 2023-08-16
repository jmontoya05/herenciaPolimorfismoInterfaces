package figurasGeometricas;

public class Triangulo implements FiguraGeometrica{
    private int base;
    private int altura;
    private int lado;

    public Triangulo(int base, int altura, int lado){
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return (double) (this.base * this.altura) / 2;
    }

    @Override
    public double calcularPerimetro(){
        return (double) this.lado * calcularLados();
    }

    public int calcularLados(){
        return 3;
    }
}
