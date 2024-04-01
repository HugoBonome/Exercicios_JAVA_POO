package ads.poo;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    private static int diaPadrao = 01;
    private static int mesPadrao = 01;
    private static int anoPadrao = 1970;


    public Data(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31 ) {
            if (mes < 1 || mes > 12) {
                if (ano > 2024) {
                    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 11 && dia > 30){
                        this.dia = diaPadrao;
                        this.mes = mesPadrao;
                        this.ano = anoPadrao;

                    }
                    this.dia = diaPadrao;
                    this.mes = mesPadrao;
                    this.ano = anoPadrao;
                }
            }
        } else{
            this.dia = dia;
        }

        if (mes)
        this.mes = mes;
        this.ano = ano;
    }

    public Data() {
        this.dia = diaPadrao;
        this.mes = mesPadrao;
        this.ano = anoPadrao;
    }


}
