package Taller9;

public class Pez extends Animal {
    private String tipoDeAgua;

    public Pez (String especie, String tipoDeAgua){
        super(especie);
        this.tipoDeAgua = tipoDeAgua;
    }
    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie();
        System.out.println("Tipo De Agua = " + tipoDeAgua);
    }
}
class main{
    public static void main(String[] args) {
        Pez pez= new Pez("Pez globo", "Salada");
        System.out.println("Detalles del  pez");
        pez.mostrarEspecie();
    }
}