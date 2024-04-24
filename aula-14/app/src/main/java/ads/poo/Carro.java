package ads.poo;

import java.util.ArrayList;

public class Carro {

    private String cor;
    private String modelo;
    private Motor motor;

    public Carro(String modelo, String cor, Motor motor) {
        this.cor = cor;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void setMotor(Motor x){
        this.motor = x;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setCarro(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return  "_______________\n" +
                "Modelo do Carro: " + modelo + "\n" +
                "cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor=" + motor +
                '}';
    }
}
