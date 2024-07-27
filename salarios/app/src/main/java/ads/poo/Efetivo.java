package ads.poo;

public class Efetivo extends Comissionado{

    private double valorFixo;


    public Efetivo(String nome, String cpf, double salario, double percentualComissao, double totalVendido, double valorFixo) {
        super(nome, cpf, salario, percentualComissao, totalVendido);
        this.valorFixo = valorFixo;
    }

    public double calcularSalario(){
        return super.calcularSalario() + valorFixo;
    }
}
