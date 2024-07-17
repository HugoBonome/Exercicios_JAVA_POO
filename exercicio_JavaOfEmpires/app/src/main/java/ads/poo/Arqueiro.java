package ads.poo;

public class Arqueiro extends Personagem {

    private int numFlechas;


    public Arqueiro(int saude, int ataque, int velocidade, int numFlechas) {
        super(saude, ataque, velocidade);
        this.numFlechas = numFlechas;
    }

    public Arqueiro(int saude, int ataque, int velocidade) {
        super(saude, ataque, velocidade);
    }

    @Override
    public String mover() {
        return super.mover();
    }

    @Override
    public String atacar() {
        return super.atacar();
    }
}
