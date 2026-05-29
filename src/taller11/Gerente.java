package taller11;

public class Gerente extends Empleado{
    private double sueldoBase;
    private double bono;

    public Gerente(String nombre, double sueldoBase, double bono){
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.bono = bono;
    }
    @Override
    public double calcularSalario(){
        return this.sueldoBase + this.bono;
    }
}