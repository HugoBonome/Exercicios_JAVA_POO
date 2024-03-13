package ads.poo;

public class Caneta {

    private int nivelTinta = 100;
    private String cor;

    

    public int getNivelTinta() {
        return nivelTinta;
    }

    public void setNivelTinta(int nivelTinta) {
        this.nivelTinta = nivelTinta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void escolherCor(String c){
        cor = c;
    }

    public String obterCor(){
        return cor;
    }    

    public String desenhar(){
        if (nivelTinta >=1){
            return "Desenhando na cor" + cor;
            nivelTinta--; 
        } else {
           return "Tinta Insuficiente";
        }
    }
}
