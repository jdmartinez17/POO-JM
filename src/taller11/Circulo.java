package taller11;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }
    @Override
    public double calcularArea(){
        return Math.PI * (this.radio * this.radio);
    }
}
class main {
    public static void main(String[] args) {
        Figura circulo = new Circulo(3.0);
        System.out.println("Círculo");
        circulo.mostrarArea();

    }
}