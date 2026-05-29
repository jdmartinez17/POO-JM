package taller13;

// Un pato puede hacer ambas cosas, así que implementa ambos contratos
public class Pato implements Volador, Nadador {

    @Override
    public void volar() {
        System.out.println("El pato está volando batiendo sus alas.");
    }

    @Override
    public void nadar() {
        System.out.println("El pato está nadando en el estanque.");
    }
}