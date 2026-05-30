package taller14;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    public void calcularArea() {
        double area = Math.PI * (radio * radio);
        System.out.println("El área del círculo es: " + area);
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 6c1b62784a1e92dc8f0f926a414a20094f2c77e5
