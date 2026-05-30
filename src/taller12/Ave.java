package taller12;

public class Ave  implements Volador, Cantante{
    @Override
    public void volar(){
        System.out.println("El ave está volado");

    }
    @Override
    public void cantar(){
        System.out.println("El ave está cantando");
    }
}
class main{
    public static void main(String[] args) {
        Ave ave = new Ave();

        ave.volar();
        ave.cantar();

    }
}

