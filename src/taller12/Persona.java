package taller12;

public class Persona implements Hablador, Trabajador{

    @Override
    public void hablar(){
        System.out.println("La persona está hablando");
    }
    @Override
    public void trabajar(){
        System.out.println("La persona está trabajando");
    }
}
class PruebaPersona{
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.hablar();
        persona.trabajar();
    }
}