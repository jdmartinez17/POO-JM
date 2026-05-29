package taller10;

public class MainVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo bicicleta = new Bicicleta();

        System.out.println("sobrescritura");
        vehiculo.moverse();
        bicicleta.moverse();

    }
}