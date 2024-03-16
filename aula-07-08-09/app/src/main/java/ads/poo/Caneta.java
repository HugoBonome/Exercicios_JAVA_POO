package ads.poo;

public class Caneta {

    private int nivelTinta = 100;
    private String cor;



//  Código está se repetindo, não é bom.
    public Caneta(int nivelTinta, String cor) {
        this.nivelTinta = nivelTinta;
        this.cor = cor;
    }

    public Caneta(String cor){
        this(100, cor);
    }

    public Caneta(){
        this(100, "vermelha");
    }

//     Substitutido pelo generator
//    public int getNivelTinta() {
//        return nivelTinta;
//    }
//
//    public String getCor() {
//        return cor;
//    }
//
//    public void escolherCor(String c){
//        cor = c;
//    }
//
//    public String obterCor(){
//        return cor;
//    }

//    public String desenhar(){
//        if (nivelTinta >=1){
//            return "Desenhando na cor" + cor;
//            nivelTinta--;
//        } else {
//           return "Tinta Insuficiente";
//        }
//    }
}
