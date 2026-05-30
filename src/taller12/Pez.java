package taller12;

public class Pez implements Nadador, Respirador{
    @Override
    public void nadar(){
        System.out.println("El pez está nadando");
    }
    @Override
    public void respirar(){
        System.out.println("El pez está respirando");
    }
}
class Main{
    public static void main(String[] args) {
        Pez pez = new Pez();

        pez.nadar();
        pez.respirar();
    }
}