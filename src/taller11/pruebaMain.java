package taller11;

public class pruebaMain {
    public static void main(String[] args) {

        Empleado empleado1 = new Gerente("Lina Martinez", 210000, 1500000);

        Empleado empleado2 = new Vendedor("Julian Alvarez", 1500000, 20, 0.08);

        System.out.println("Detalles");
        empleado1.mostrarDetalles();
        empleado2.mostrarDetalles();



    }
}