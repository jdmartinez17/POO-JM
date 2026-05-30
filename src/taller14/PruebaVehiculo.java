package taller14;

public class PruebaVehiculo {
    public static void main(String[] args) {
        Vehiculo miCoche = new Coche();
        Vehiculo miBicicleta = new Bicicleta();

        miCoche.mover();
        miBicicleta.mover();
    }
}