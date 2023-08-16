package figurasGeometricas;

public class Cuadrado implements FiguraGeometrica{
    private int lado;

    public Cuadrado(int lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return (double) this.lado * this.lado;
    }

    @Override
    public double calcularPerimetro(){
        return (double) this.lado * this.calcularLados();
    }

    public int calcularLados(){
        return 4;
    }

}
