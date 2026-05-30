package taller12;

interface Caminador {
    void caminar();
}

// error 1 Al no incluir el método caminar(),
// Java exige que la clase se declare como abstract, al quitar el comentario de abajo se ve el error
/*
class Perro implements Caminador {
}
*/

interface Saltador {
    void saltar();
}

class Auto implements Saltador {

    @Override
    public void saltar() {
        // mala práctica porqu un auto no salta. Obligar a la clase a usar esta interfaz
        // rompe la coherencia del diseño y te fuerza a crear métodos inútiles
        System.out.println("Los autos no saltan");
    }
}

class EjercicioIncorrecto {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.saltar();
    }
}
