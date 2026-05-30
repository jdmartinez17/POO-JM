package taller14;

public class PruebaFigura {
    public static void main(String[] args) {
        // Uso de polimorfismo dinámico: la referencia es de la clase base
        Figura miCirculo = new Circulo(5.0);
        Figura miRectangulo = new Rectangulo(4.0, 6.0);

        miCirculo.calcularArea();    // Ejecuta el método sobrescrito en Circulo
        miRectangulo.calcularArea(); // Ejecuta el método sobrescrito en Rectangulo
    }
}