package ads.poo;

public class Funcionario {
    private String nome;
    private String cpf;
    protected double salario;

    public Funcionario(String nome, String cpf, double salario) {

    }

    public double calcularSalario() {
        return salario;
    }
    public String getNome() {
        return this.nome;
    }




}
