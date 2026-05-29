/*
package Taller9;
class Vehiculo {

    // Atributo privado, no visible para las clases hijas
    private String chasis;

    public Vehiculo (String chasis){
        this.chasis = chasis;
    }
}

// Clase hija
class Coche extends Vehiculo {
    public Coche (String chasis){
        super(chasis);
    }
    public void mostrarDatos() {
        //Error de compilacion porque intentó  acceder a un atributo privado y este
        // indicará que chasis tiene acceso privado en Vehiculo y la clase hija no tiene permiso
       // para aceder a ella

        System.out.println("Chasis: " + super.chasis);
    }
}

    class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("CH-45678");
        coche.mostrarDatos();

        // Se Usó super fuera del contexto de herencia
        // El compilador indicará que no se puede referenciar super desde un contexto estático

    }
}
 */


