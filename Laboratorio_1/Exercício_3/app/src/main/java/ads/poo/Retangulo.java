package ads.poo;

public class Retangulo {

    private int largura;
    private int altura;
    private String cod;

    private static int largpadrao = 4;
    private static int altpadrao = 3;
    private static String codpadrao = "ASCII";


    public Retangulo() {
        this.largura = largpadrao;
        this.altura = altpadrao;
        this.cod = codpadrao;
    }

    public Retangulo(int largura, int altura, String cod) {
        this.largura = largura;
        this.altura = altura;
        this.cod = cod;
    }
}
