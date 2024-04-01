package ads.poo;

public class Retangulo {

    private double largura;
    private double altura;
    private String cod;

    private static double largpadrao = 4;
    private static double altpadrao = 3;
    private static String codpadrao = "ASCII";


    public Retangulo() {
        this.largura = largpadrao;
        this.altura = altpadrao;
        this.cod = codpadrao;
    }

    public Retangulo(double largura, double altura, String cod) {
        this.largura = largura;
        this.altura = altura;
        this.cod = cod;
    }

    public boolean setLargura(double largura) {
        if (largura <= 0){
            return false;
        } else {
            this.largura = largura;
            return true;
        }
    }

    public boolean setAltura(double altura) {
        if (altura <= 0){
            return false;
        } else {
            this.altura = altura;
            return true;
        }
    }

    public boolean setCod(String scod) {
        if (scod.equals("ASCII") || scod.equals("UTF8")){
            return false;
        } else {
            this.cod = scod;
            return true;
        }
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public String getCod() {
        return cod;
    }
     public double areaRetangulo(){
        double area = this.altura*this.largura;
        return area;
     }

//    public String toString() {
//        StringBuilder representacao = new StringBuilder();
//
//        // Topo do retângulo
//        representacao.append("+");
//        for (int i = 0; i < largura - 2; i++) {
//            representacao.append("-");
//        }
//        representacao.append("+\n");
//
//        // Lados do retângulo
//        for (int i = 0; i < altura - 2; i++) {
//            representacao.append("|");
//            for (int j = 0; j < largura - 2; j++) {
//                representacao.append(" ");
//            }
//            representacao.append("|\n");
//        }
//
//        // Base do retângulo
//        representacao.append("+");
//        for (int i = 0; i < largura - 2; i++) {
//            representacao.append("-");
//        }
//        representacao.append("+");
//
//        return representacao.toString();
//    }
    public String toString() {
        String figura = "";

        figura += "+";
        for (int i = 0; i < largura - 2; i++) {
            figura += "-";
        }
        figura += "+\n";

        for (int i = 0; i < altura - 2; i++) {
            figura += "|";
            for (int j = 0; j < largura - 2; j++) {
                figura += " ";
            }
            figura += "|\n";
        }

        figura += "+";
        for (int i = 0; i < largura - 2; i++) {
            figura += "-";
        }
        figura += "+";

        return figura;
    }



}
