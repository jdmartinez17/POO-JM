package taller11;

public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea(){
        return this.base* this.altura;
    }
}
class mainn {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(4.5, 3.5);
        System.out.println("Rectángulo");
        rectangulo.mostrarArea();
    }
}