package taller11;

public abstract class Vehiculo {
    /* Al dejarlo como método concreto las clases hijas heredan este comportamiento
    por defecto y el compilador no las obliga a sobrescribirlo. Esto es un error de diseño porque cada
     vehículo debería frenar a su propia manera (un camión no frena igual que un auto compacto).*/
    public void frenar() {
        System.out.println("El vehículo se detiene usando frenos estándar.");
    }
}

class Camion extends Vehiculo {
    // No se sobrescribe el método frenar
}

class Main {
    public static void main(String[] args) {

            /* Al quitar las barras de comentario de la línea de abajo da error inmediatamente porque
             Java prohíbe crear objetos de clases abstractas. */

        // Vehiculo vehiculoBase = new Vehiculo();

        //
        Camion miCamion = new Camion();
        miCamion.frenar(); // Imprime el método normal porque el diseño no obligó a su implementación.
    }
}