Package taller14;

class AnimalBase {
    public void hacerSonido() {
        System.out.println("Sonido de animal");
    }
}

class PerroMascota extends AnimalBase {
    @Override
    public void hacerSonido() {
        // 2. Mala práctica: Sobrescribir sin cambiar el comportamiento
        // Llamar solo a super sin añadir nada nuevo es código innecesario.
        super.hacerSonido();
    }

    public void jugarPelota() {
        System.out.println("El perro juega con la pelota");
    }
}

//public class UsoIncorrectoPolimorfismo {
    public static void main(String[] args) {
        //   AnimalBase miMascota = new PerroMascota();
        // miMascota.hacerSonido(); // Esto funciona.

        // 1. Error de compilación:
        // Intentar invocar un método que existe solo en la clase derivada
        // utilizando una referencia de la clase base.

        /* miMascota.jugarPelota(); // <-- ESTO GENERA ERROR
        // El compilador revisa la clase 'AnimalBase', no encuentra 'jugarPelota()' y falla.
        */
    }