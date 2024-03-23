package ads.poo;

public class Horario {

    private int hora;
    private int minuto;
    private int segundo;

    public Horario() {
        this.hora = 00;
        this.minuto = 00;
        this.segundo = 00;
    }


    public Horario(int hora, int minuto, int segundo){
        if (hora <= 0 || hora > 24){
            hora = 00;
            minuto = 00;
            segundo = 00;
        }
        this.hora = hora;

        if (minuto <= 0 || minuto > 60) {
            hora = 00;
            minuto = 00;
            segundo = 00;
        }
            this.minuto = minuto;
        if (segundo <= 0 || minuto > 60) {
            hora = 00;
            minuto = 00;
            segundo = 00;
        }
            this.segundo = segundo;
    }

    public Horario(int hora){
        this(hora, 00, 00);
    }
    public Horario(int hora, int minuto){
        this(hora, minuto, 00);
    }

    @Override
    public String toString() {
        return "Horario: " + hora +":" + minuto +":" + segundo ;
    }

    public boolean setHora(int hora){
        if (hora <= 0 || hora > 24){
            return true;
        } else {
            return false;
        }
    }
    public boolean setMinuto(int minuto){
        if (minuto <= 0 || minuto > 60){
            this.minuto = minuto;
            return true;
        } else {
            return false;
        }
    }

}
