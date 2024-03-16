package ads.poo;

public class Carro {
    
    // Atributos da Classe

    private double velocidade;

    public Carro(double velocidade) {
        if (velocidade > 200){
            velocidade = 0;
        } else if (velocidade < 0) {
            velocidade = 0;
        }
        this.velocidade = velocidade;
    }

    public void acelerar(double v){
        if (v < 0) {
            v = 0;
        }
        velocidade+=v;
        if (velocidade > 200){
            velocidade = 0;
        }
    }

    public void freiar(double v){
        if (v < 0) {
            v = 0;
        }
        velocidade-=v;
        if (velocidade < 0) {
            velocidade = 0;
        }
    }

    public double obterVelocidade(){
        return velocidade;
    }

}
