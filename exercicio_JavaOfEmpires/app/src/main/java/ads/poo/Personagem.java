package ads.poo;

public class Personagem {

    protected int saude;
    protected int ataque;
    protected int velocidade;

    public Personagem(int saude, int ataque, int velocidade) {
        this.saude = saude;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public String mover(){
        return  "Personagem se movendo na velocidade: " + this.velocidade;
    }

    public String atacar(){
        return  "Personagem atacando com força: " + this.ataque;
    }



}
