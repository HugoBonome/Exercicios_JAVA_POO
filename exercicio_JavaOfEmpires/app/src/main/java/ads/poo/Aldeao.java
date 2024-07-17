package ads.poo;

import java.util.Scanner;

public class Aldeao extends Personagem{

    private int velocidadeDeColeta;


    public Aldeao(int saude, int ataque, int velocidade, int velocidadeDeColeta) {
        super(saude, ataque, velocidade);
        this.velocidadeDeColeta = velocidadeDeColeta;
    }

    public String coletar(String recurso, int tempo) {
        int qtdTotal = velocidadeDeColeta * tempo;
        return "O  Aldeão coletou " + qtdTotal + " de " + recurso + " no intervalo de "+ tempo + " minutos";
    }

    @Override
    public String mover() {
        return "Aldeão se movendo na velocidade: " + this.velocidade;
    }

    @Override
    public String atacar() {
        return "Aldeão atacando com força: " + this.ataque;
    }
}
