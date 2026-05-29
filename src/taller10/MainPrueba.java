package taller10;

public class MainPrueba {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona estudiante = new Estudiante();
        Persona profesor = new Profesor();

        System.out.println("Ejecutando métodos");
        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();

    }
}
