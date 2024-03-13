package ads.poo;

public class Contador {

    private int valorAtual;

    public void atribuirValor(int v){
        valorAtual=v;
        System.out.println("Valor " + v + " Atribuido ao contador");
    } 

    public void incrementar(){
        valorAtual++;
        System.out.println("Valor Incrementado");
    } 

    public int obterValor(){
        return valorAtual;
    } 
    
}
