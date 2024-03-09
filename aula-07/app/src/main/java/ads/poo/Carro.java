package ads.poo;

public class Carro {
    
    // Atributos da Classe

    private double velocidade;
    private String modelo;


    // Métodos
    public void acelerar(double v){
        velocidade+=v;
    }

    public double obterVelocidade(){
        return velocidade;
    }

}
