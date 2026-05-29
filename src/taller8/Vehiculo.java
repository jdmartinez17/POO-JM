package taller8;

public class Vehiculo {
    protected String marca;
    protected double velocidadMaxima;

    public Vehiculo(String marca, double velocidadMaxima){
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }
    public void mostrarInformacion(){
        System.out.println("marca = " + marca);
        System.out.println("velocidadMaxima = " + velocidadMaxima);
    }
}