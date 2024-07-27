package ads.poo;

public class Horista extends Funcionario{

    private double valorHora;
    private int horasTrabalhadas;
    private double valorHoraExtra;

    public Horista(String nome, String cpf, double salario, double valorHora, int horasTrabalhadas, double valorHoraExtra) {
        super(nome, cpf, salario);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    public double calcularSalario() {
        int horasResiduais;

        if (horasTrabalhadas > 40) {
            horasResiduais = horasTrabalhadas - 40;
            salario = horasResiduais * valorHora;
            salario = salario + (horasResiduais*valorHoraExtra);
        } else {
            salario = horasTrabalhadas * valorHoraExtra;
        }
        return salario;
    }
}
