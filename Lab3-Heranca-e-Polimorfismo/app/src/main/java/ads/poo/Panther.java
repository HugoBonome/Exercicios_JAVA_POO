package ads.poo;

public class Panther extends Veiculo {
    private int temperaturaGeladeira;

    public Panther(int id, int velocidadeAtual, int temperaturaGeladeira) {
        super(id, velocidadeAtual);
        this.temperaturaGeladeira = temperaturaGeladeira;
    }



    public int setTemperaturaGeladeira(int temp) {
        temperaturaGeladeira = temp;
        return temperaturaGeladeira;
    }
}
