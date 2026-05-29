package taller11;

public class Vendedor extends Empleado{
    private double sueldoBase;
    private double ventasRealizadas;
    private double porcentajeComision;

    public Vendedor (String nombre, double sueldoBase, double VentasRealizadas, double porcentajeComision){
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.ventasRealizadas = VentasRealizadas;
        this.porcentajeComision = porcentajeComision;

    }
    @Override
    public double calcularSalario (){
        return this.sueldoBase + (this.ventasRealizadas * this.porcentajeComision);
    }
}