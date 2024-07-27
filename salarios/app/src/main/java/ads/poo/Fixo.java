package ads.poo;

public class Fixo extends Funcionario {

    private double salarioFixo;

    public Fixo(String nome, String cpf, double salario, double salarioFixo){
        super(nome, cpf, salario);
        this.salarioFixo = salarioFixo;
    }

    @Override
    public double calcularSalario() {
        return this.salarioFixo;
    }
}
