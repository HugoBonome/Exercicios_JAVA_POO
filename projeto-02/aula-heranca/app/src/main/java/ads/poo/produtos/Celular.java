package ads.poo.produtos;

public class Celular extends SemFio {

    private String so;


    public Celular(String numSerie, int codigo, String modelo, float peso, Dimensao dim, float frequencia, int canais, float distancia, String so) {
        super(numSerie, codigo, modelo, peso, dim, frequencia, canais, distancia);
        this.so = so;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    @Override
    public String imprimirDados() {
        return super.imprimirDados() + this.so;
    }
}
