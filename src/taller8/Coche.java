package taller8;

public class Coche extends Vehiculo {
    private int numeroDePuertas;

    public Coche(String marca,double velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("numeroDePuertas = " + numeroDePuertas);
    }
}