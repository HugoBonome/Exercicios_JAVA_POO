/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ads.poo;


import java.util.ArrayList;
import java.util.HashMap;

public class App {



    public static void main(String[] args) {

        HashMap<String, Livro> bancoDeDados = new HashMap<>();
        ArrayList<Autor> autoresReceita = new ArrayList<>();

        Autor x = new Autor("juca", "Brasileiro");
        Autor y = new Autor("Juke", "Americano");

        autoresReceita.add(x);
        autoresReceita.add(y);

        Livro a = new Livro("Receitas de Pudim", "1112223334445", 15.0,autoresReceita);
        bancoDeDados.put(a.getIsbn(), a);
        System.out.println(a);



        ArrayList<Autor> autoresMagia = new ArrayList<>();

        Autor z = new Autor("Tom Riddle", "Britânico");
        autoresMagia.add(z);

        Livro b = new Livro("Magia das Trevas Descomplicada", "2222333344445", 49.90,autoresMagia);

        System.out.println(b);
    }

}
