package taller8;

public class mainprueba {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", 220, 8);
        coche.mostrarInformacion();
    }
}
class claseprueba {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Andrea Palacios", 22, "ZK-2090-17");
        estudiante.mostrarDetalles();
    }
}
class Mainprueba {
    public static void main(String[] args) {
        Empleado empleado = new Empleado ( "Alfredo Guzman", 320000);
        empleado.mostrarDetalles();

        Gerente gerente = new Gerente("Armando Rodriguez", 400000, "Sistemas");
        gerente.mostrarDetalles();
    }
}