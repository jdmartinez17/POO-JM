package taller8;

/*public class Desarrollador extends Dispositivo, LiderProyecto, Ciudadano {

    public Desarrollador(String modelo, double precioComponentes, String nombreCompleto, double presupuesto, int anhosExperiencia, String areaDesarrollo) {
        // Aquí el compilador falla inmediatamente porque no puede determinar a qué constructor padre invocar
        // ni cómo estructurar los espacios de memoria del objeto.
        super(modelo, precioComponentes);
    }

    public void intentoDeAccesoDatos() {
        System.out.println("Modelo de PC = " + this.modelo);
        System.out.println("Presupuesto Asignado = " + this.presupuesto);

        // ERROR de Encapsulamiento: La clase hija no tiene autorización para acceder a miembros privados.
        System.out.println("Años de Experiencia = " + this.anhosExperiencia); // 'anhosExperiencia' es private en Ciudadano
        System.out.println("Área de Trabajo = " + this.areaDesarrollo);       // 'areaDesarrollo' es private en LiderProyecto

        /* * Diagnóstico de Errores:
         * 1. En Java no existe la herencia múltiple para clases (mecanismo restringido para evitar el problema del diamante).
         * Una clase derivada está limitada a tener una única clase base directa.
         * 2. Los miembros declarados como 'private' pertenecen exclusivamente al ámbito de la clase donde se definieron.
         * Incluso si la herencia fuese válida, el modificador 'private' restringe por completo la visibilidad,
         * impidiendo que las clases derivadas lean o alteren estos campos de forma directa.
         */

 