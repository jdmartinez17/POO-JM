package taller12;

//La clase usa la interfaz pero omite sus métodos
//Si se quitan los símbolos del comentario mostrará un error

/*
 public class Coche implements Corredor {
    // El error ocurre porque falta añadir el método correr() aquí
}

 */

// Darle a una clase una capacidad que no tiene sentido lógico
class Arbol implements Corredor {
    @Override
    public void correr() {
        // El código funciona y compila, pero es incorrecto
        System.out.println("Los árboles no corren.");
    }
}
class Mainn {
    public static void main(String[] args) {

        Arbol arbol = new Arbol();
        arbol.correr();

    }
}
