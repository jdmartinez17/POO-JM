package taller7;

public class Empleado {
    public String nombre;
    private double salario;

    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        setSalario(salario); // set publico para que valide el salario
    }
    // Get publico
    public double getSalario(){
        return this.salario;
    }
    // set publico para validacion
    public void setSalario(double salario) {
        // el salario no puede ser un numero menor a 0
        if (salario >=0){
            this.salario = salario;
        } else {
            System.out.println("Error : el salario no puede ser negativo");
        }
    }

}
class Main {
    public static void main(String[] args){
        System.out.println("Datos iniciales");
        // instanciando el objeto empleado
        Empleado empleado = new Empleado("Eduardo Gonzales", 2300000);
        System.out.println("Nombre: " + empleado.nombre);
        System.out.println("Salario original: $" + empleado.getSalario());
        empleado.nombre = "Eduardo Jose Gonzales";
        empleado.setSalario(2800000);
        System.out.println("Datos actualizados");
        System.out.println("Nombre actualizdo: " + empleado.nombre);
        System.out.println("Salario actualizado: $" + empleado.getSalario());

        System.out.println("Probando datos");
        System.out.println("Se quiere ingresar un valor de: $ -2800000");
        empleado.setSalario(-2800000);
        // el sistema debe rechazarlo
        System.out.println("Salario final: $" + empleado.getSalario());

    }
}


