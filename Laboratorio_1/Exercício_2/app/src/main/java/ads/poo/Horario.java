package ads.poo;

public class Horario {

    private int hora;
    private int minuto;
    private int segundo;
    private static int padrao = 00;

    private static String[] he = {"zero","uma","duas","três","quatro","cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "catorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove", "vinte", "vinte e um", "vinte e dois", "vinte e três", "vinte e quatro"};
    private static String[] unit = {"zero","um","dois","três","quatro","cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "catorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove",};
    private static String[]  dezena = {"vinte e ", "trinta e ", "quarenta e ", "cinquenta e "};

    public Horario() {
        this.hora = padrao;
        this.minuto = padrao;
        this.segundo = padrao;
    }


    public Horario(int hora, int minuto, int segundo) {
        if (hora <= 0 || hora > 24) {
            this.hora = padrao;
            this.minuto = padrao;
            this.segundo = padrao;
        }
        this.hora = hora;

        if (minuto < 0 || minuto > 60) {
            this.hora = padrao;
            this.minuto = padrao;
            this.segundo = padrao;
        }
        this.minuto = minuto;

        if (segundo < 0 || minuto > 60) {
            this.hora = padrao;
            this.minuto = padrao;
            this.segundo = padrao;
        }
        this.segundo = segundo;
    }

    public Horario(int hora) {
        this(hora, padrao, padrao);
    }

    public Horario(int hora, int minuto) {
        this(hora, minuto, padrao);
    }

    @Override
    public String toString() {
        return "Horario: " + hora + ":" + minuto + ":" + segundo;
    }

    public boolean setHora(int hora) {
        if (hora <= 0 || hora > 24) {
            this.hora = padrao;
            return false;
        } else {
            this.hora = hora;
            return true;
        }
    }

    public boolean setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59) {
            return false;
        } else {
            this.minuto = minuto;
            return true;
        }
    }

    public boolean setSegundo(int segundo) {
        if (segundo < 0 || segundo > 59) {
            return false;
        } else {
            this.segundo = segundo;
            return true;
        }

    }

    public String horaExtenso(){
        int h = hora;
        int m = minuto;
        int s = segundo;
        String hext = he[h];
        String mext;
        String sext;
        if (m > 19 ) {
            int dm = m / 10; //25
            int um = m % 10;
            String dmin = dezena[dm-2];
            String umin = unit[um];
            mext = dmin + umin;
        } else {
            mext = unit[m];
        }

        if (s > 19 ) {
            int ds = s / 10; //25
            int us = s % 10;
            String dsec = dezena[ds-2];
            String usec = unit[us];
            sext = dsec + usec;
        } else {
            sext = unit[s];
        }
        return hext + " horas, " + mext + " minutos, " + "e " + sext + " segundos.";
    }

    public long horaEmSegundos(){
        long horasec = hora*3600 + minuto*60 + segundo;
        return horasec;
    }

    public long difHorario(Horario h){
        long difhora = this.horaEmSegundos() - h.horaEmSegundos();
        return difhora;
    }

}