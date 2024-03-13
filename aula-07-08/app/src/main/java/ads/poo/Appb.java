package ads.poo;

public class Appb {

    public static void main(String[] args) {
        
        Buzz b = new Buzz();

        System.out.println(b.dispararLaser());

        System.out.println("Capacete aberto? " + b.capaceteAberto());
        b.ativarCapacete();
        System.out.println("Capacete aberto? " + b.capaceteAberto());

        Buzz malvado = new Buzz();

        System.out.println("Capacete aberto? " + malvado.capaceteAberto());

    }
    
}
