package ads.poo;

public class Data {

    private int dia;
    private int mes;
    private int ano;
    private static final int diaPadrao = 1;
    private static final int mesPadrao = 1;
    private static final int anoPadrao = 1970;

    private static final String[] mesExt= {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};


    public Data(int dia, int mes, int ano) {

        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 0) {
            this.dia = diaPadrao;
            this.mes = mesPadrao;
            this.ano = anoPadrao;
        } else if (((dia > 30) && (mes != 1)) && (mes != 3) && (mes != 5) && (mes != 7) && (mes != 8) && (mes != 10) && (mes != 11)) {
                this.dia = diaPadrao;
                this.mes = mesPadrao;
                this.ano = anoPadrao;
        } else if (mes == 2 && dia > 28) {
            if (((ano % 4) == 0)) {
                if ((ano % 100) != 0 || (ano % 400) == 0) {
                    this.dia = dia;
                    this.mes = mes;
                    this.ano = ano;
                }else {
                    this.dia = diaPadrao;
                    this.mes = mesPadrao;
                    this.ano = anoPadrao;
                }
            }else {
                this.dia = diaPadrao;
                this.mes = mesPadrao;
                this.ano = anoPadrao;
            }
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    public Data() {
            this.dia = diaPadrao;
            this.mes = mesPadrao;
            this.ano = anoPadrao;
    }

    public boolean setDia(int dia) {
        if (dia > 31) {
            return false;
        } else {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 11 && dia > 30) {
                return false;
            } else {
                if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia > 30) {
                    return false;
                } else {
                    if (((ano % 4) == 0 || (ano % 100) == 0 && (ano % 400) != 0) && (mes == 2) && (dia > 29)) {
                        return false;
                    } else if (mes == 2 && dia > 28) {
                        return false;
                    } else {
                        this.dia = dia;
                        return true;
                    }
                }
            }
        }
    }

    public boolean setMes(int mes) {
        if (mes > 12){
            return false;
        } else {
            this.mes = mes;
            return true;
        }
    }

    public boolean setAno(int ano) {
        if (ano < 0){
            return false;
        } else {
            this.ano = ano;
            return true;
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String dataExtenso() {
        String mesExtenso = mesExt[mes-1];
        return "{" + dia + " de " + mesExtenso + " de " + ano + "}";
    }

    @Override
    public String toString() {
        return "Data{" + this.dia + "/" + mes + "/" + ano + '}';
    }

    public long diferencaDatasEmDias(Data d) {
//        long diasX = this.dia + (30 * this.mes) + (this.ano * 365);
//        long diasY = d.dia + (d.mes * 30) + (d.ano * 365);
//
//        return diasX-diasY;
        long difDias = Math.abs(d.dia - this.dia);
        long difMes = 30 * (Math.abs(d.mes - this.mes));
        long difAno = 365 * (Math.abs(d.ano - this.ano));
        return difAno+difMes+difDias;
    }
}