package ads.poo;

public class Comissionado extends Funcionario{

    protected double percentualComissao;
    protected double totalVendido;


    public Comissionado(String nome, String cpf, double salario, double percentualComissao, double totalVendido) {
        super(nome, cpf, salario);
        this.percentualComissao = percentualComissao;
        this.totalVendido = totalVendido;
    }

    @Override
    public double calcularSalario() {
        double percentual = percentualComissao/100;
        salario = totalVendido * percentual;
        return salario;
    }
}
