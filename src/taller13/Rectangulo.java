package taller13;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Proporcionamos la implementación específica para el rectángulo
    @Override
    public double calcularArea() {
        return base * altura;
    }
}