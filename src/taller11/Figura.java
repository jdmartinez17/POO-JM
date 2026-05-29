package taller11;

public abstract class Figura {
    public abstract double calcularArea();
    public void mostrarArea(){
        System.out.println("El área calculada es: " + calcularArea());
    }
}
