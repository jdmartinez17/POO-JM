package taller7;

public class Utilidades {
    double suma (double a, double b){
        return a + b;
    }
    double resta(double a, double b){
        return a - b;
    }
    double multiplicacion(double a, double b){
        return a * b;
    }
    double division(double a, double b){
        if (b == 0) {
            System.out.println(" No se puede dividir por 0");
            return 0;
        }
        return a / b;
    }
}
class Mainn {
    public static void main(String[] args) {
        // se instancia la clase para acceder a los metodos
        Utilidades util = new Utilidades();
        System.out.println("Resultado de la suma = " + util.suma(34, 2));
        System.out.println("Resultado de la resta = " + util.resta(120, 80));
        System.out.println("Resultado de la multiplicación = " + util.multiplicacion(9, 9));
        System.out.println("Resultado de la división = " + util.division(24, 2));

    }
}