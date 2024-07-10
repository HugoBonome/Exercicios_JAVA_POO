package ads.poo.produtos;

public class Telefone {

    private int codigo;
    private String numSerie;
    private String modelo;
    protected float peso;
    private Dimensao dim;

    public Telefone(String numSerie, int codigo, String modelo, float preco, Dimensao dim) {
        this.numSerie = numSerie;
        this.codigo = codigo;
        this.modelo = modelo;
        this.peso = preco;
        this.dim = dim;
    }


    public String imprimirDados() {

        String semfio = this.toString();
        return "Telefone{" +
                "codigo=" + codigo +
                ", numSerie='" + numSerie + '\'' +
                ", modelo='" + modelo + '\'' +
                ", preco=" + peso +
                ", dim=" + dim +
                '}';
    }
}
