package taller10;

public class Programador extends Empleado{
    /* Intento de sobrescritura con firma incorrecta, si cambio el parametro java lo
    trata como un metodo nuevo, si se le pone override, el compilador dra error
     */
    // @Override
    public void trabajar (String tarea){
        System.out.println("El programador está trabajando = " + tarea);
    }
    /* Sobrescritura sin override, si se comete un error en la escritura el compiloador no te avisa
    y el metodo no se sobrescribiría al original
     */
    public void trabajarr() {
        System.out.println("No hace nada por error en la escritura ");
    }
}

class main {
    public static void main(String[] args) {
        Programador programador = new Programador();
        programador.trabajar();

    }

}