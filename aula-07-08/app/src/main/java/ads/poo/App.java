package ads.poo;

public class App {

    public static void main(String[] args) {
        
        Carro c = new Carro();

        System.out.println("Velocidade :" + c.obterVelocidade());

        c.acelerar(10);
        
        System.out.println("Velocidade :" + c.obterVelocidade());

        c.freiar(5);

        System.out.println("Velocidade :" + c.obterVelocidade());

        var x = new Contador();

        x.atribuirValor(50);

        System.out.println("O valor atual é: " + x.obterValor());

        x.incrementar();

        System.out.println("O valor atual é: " + x.obterValor());

        



    }
}
