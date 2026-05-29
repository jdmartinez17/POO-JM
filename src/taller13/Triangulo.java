package taller13;


public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Proporcionamos la implementación específica para el triángulo
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
