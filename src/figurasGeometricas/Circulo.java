package figurasGeometricas;

public class Circulo implements FiguraGeometrica{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        return (double) Math.PI * Math.pow(this .radio, 2);
    }

    @Override
    public double calcularPerimetro(){
        return  2 * Math.PI * this.radio;
    }

    public int calcularLados(){
        return 0;
    }
}
