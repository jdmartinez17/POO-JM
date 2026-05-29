package taller13;

public class MainFigura {
    public static void main(String[] args) {
        // Instanciamos usando polimorfismo
        Figura miRectangulo = new Rectangulo(5.0, 4.0);
        Figura miTriangulo = new Triangulo(5.0, 4.0);

        System.out.println("Área del Rectángulo: " + miRectangulo.calcularArea());
        System.out.println("Área del Triángulo: " + miTriangulo.calcularArea());
    }
}