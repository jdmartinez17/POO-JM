package taller7;

class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void mostrarDetalles() {
        System.out.println("Detalles de la cuenta");
        System.out.println("Número de Cuenta = " + this.numeroCuenta);
        System.out.println("Tipo de Cuenta = " + this.tipoCuenta);
        System.out.println("Saldo disponible = $" + this.saldo);
    }

}
class main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("987654321",250000, "Ahorros");
        cuenta.mostrarDetalles();

        // Hay que quitar las barras de la linea de abajo para ver el error de compilacion
        //System.out.println(cuenta.numeroCuenta);

    }

}
