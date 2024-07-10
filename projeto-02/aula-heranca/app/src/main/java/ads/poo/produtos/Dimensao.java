package ads.poo.produtos;

public class Dimensao {

    private float altura;
    private float largura;
    private float profundidade;


    public Dimensao(float altura, float largura, float profundidade) {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {


        return "Dimensões{" +
                "altura=" + altura +
                ", largura=" + largura +
                ", profundidade=" + profundidade +
                "}";
    }
}
