package ads.poo;

public class Cavaleiro extends Personagem {

    private int saudeDaMontaria;
    private int velocidadeDaMontaria;


    public Cavaleiro(int saude, int ataque, int velocidade, int saudeDaMontaria, int velocidadeDaMontaria) {
        super(saude, ataque, velocidade);
        this.saudeDaMontaria = saudeDaMontaria;
        this.velocidadeDaMontaria = velocidadeDaMontaria;
    }


    @Override
    public String mover() {
        if (this.saudeDaMontaria > 0) {
            return "Cavaleiro montado em seu incrivel cavalo se movendo na velocidade: " + this.velocidadeDaMontaria;
        } else {
            return "Cavaleiro sem montaria se movendo na velocidade: " + super.velocidade;
        }
    }
}