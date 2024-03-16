package ads.poo;

import java.util.Random;

public class Buzz {
    
    private boolean capacete;
    private boolean asa;
    private String[] frase = {"Buzz Lightyear ao infinito... e além!", "Buzz Lightyear ao resgate!", "Prepare-se para a missão!", "Abrace-se para o voo!", "Fique alerta, inimigo à vista!", "Nenhum brinquedo é deixado para trás!" };


    public boolean ativarCapacete(){
        capacete = !capacete;
        return capacete;
    }

    public boolean capaceteAberto(){
        return capacete;
    }


    


//    public String falarFrase(){
//        Random r = new Random();
//        return frase(r.nextInt(6));
//
//    }

    public String dispararLaser(){
        return "Disparando Laser";
    }

    public String golpear(){
        return "Golpeando";
    }

    public boolean ativarAsa(){
        asa = !asa;
        return asa;
    }
    


}
