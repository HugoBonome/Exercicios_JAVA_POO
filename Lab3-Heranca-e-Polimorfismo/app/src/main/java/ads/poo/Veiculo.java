package ads.poo;

public class Veiculo {
    protected int id;
    protected int velocidadeAtual;
    protected int velocidadeMaxima;

    public Veiculo(int id, int velocidadeAtual) {
        this.id = id;
        this.velocidadeAtual = velocidadeAtual;
        velocidadeMaxima = velocidadeAtual;
    }

    public int acelerar(int velocidade){
        if ((velocidadeAtual += velocidade) <= velocidadeMaxima) {
            velocidadeAtual += velocidade;
            return velocidadeAtual;
        } else {
            return 0;
        }
    }

    public int frear(int velocidade){
        if ((velocidadeAtual - velocidade) > 0) {
            velocidadeAtual = velocidadeAtual - velocidade;
            return velocidadeAtual;
        } else {
            return (-1);
        }
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", velocidadeAtual=" + velocidadeAtual +
                ", velocidadeMaxima=" + velocidadeMaxima +
                '}';
    }
}
