package ads.poo.produtos;

public class SemFio extends Telefone{

    private float frequencia;
    private int canais;
    private float distancia;

    public SemFio(String numSerie, int codigo, String modelo, float peso, Dimensao dim, float frequencia, int canais, float distancia) {
        super(numSerie, codigo, modelo, peso, dim);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distancia = distancia;
    }


    @Override
    public String imprimirDados() {
        return super.imprimirDados() + ", frequência="  + this.frequencia + ", canais=" + this.canais + ", canais=" + this.distancia;
    }
}
