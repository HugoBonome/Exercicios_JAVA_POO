/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ads.poo;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Stack<Integer> n = new Stack<>();

        Integer i;
        do {
            System.out.println("Entre com o número");
            i = teclado.nextInt();

            if (i != 999){
                n.add(i);
            }
        } while (i != 999);

        while (!n.isEmpty()) {
            System.out.println(n.getFirst());
            n.removeFirst();
        }


//
//        ArrayList<Integer> n = new ArrayList<Integer>();
//
//        Integer i;
//        do {
//            System.out.println("Entre com o número");
//            i = teclado.nextInt();
//
//            if (i != 999){
//                n.add(i);
//            }
//
//        } while (i != 999);
//
//        Collections.sort(n);
//
//        n.forEach(elemento-> System.out.println("Número: " + elemento));

//        ArrayList<String> nomes = new ArrayList<>();
//        String s = "Téo";
//        nomes.add(s);
//        nomes.add("Hugo");

        //for i
//        for ( int i = 0 ; i < nomes.size(); i++){
//            System.out.println("Nome: " + nomes.get(i));
//        }
//
//        // for Each
//        for(String elemento :nomes){
//        System.out.println("Nome: " + elemento);
//        }
//
//        // usando Lambda
//        nomes.forEach(elemento-> System.out.println("Nome: " + elemento));
//
//        // method reference
//        nomes.forEach(System.out::println);


    }
}