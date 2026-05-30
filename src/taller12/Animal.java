package taller12;

public class Animal implements Voladorr, Nadadorr{
    @Override

    public void volar(){
        System.out.println("El animal está volando");
    }
    @Override
    public void nadar(){
        System.out.println("El animal está nadando");
    }
}
class Animalprueba{
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.volar();
        animal.nadar();
    }
}