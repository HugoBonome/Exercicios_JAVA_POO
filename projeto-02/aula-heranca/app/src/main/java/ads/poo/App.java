/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ads.poo;

import ads.poo.produtos.Celular;
import ads.poo.produtos.Dimensao;
import ads.poo.produtos.SemFio;
import ads.poo.produtos.Telefone;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Telefone[] t = new Telefone[4];
        t[0] = new Celular("123", 123, "123",123, new Dimensao(123, 123, 123), 123,123, 123, "Android" );
        t[1] = new Celular("123", 123, "123",123, new Dimensao(123, 123, 123), 123,123, 123, "Android" );
        t[2] = new SemFio("123", 123, "123",123, new Dimensao(123, 123, 123), 123,123, 123);
        t[3] = new Telefone("123", 123, "123",123, new Dimensao(123, 123, 123));

        for (Telefone tel : t) {
            System.out.println(tel.imprimirDados());

            // se dentro de tel houver um celular
            if (tel instanceof Celular){
                System.out.println(((Celular) tel).getSo());
            }
        }



//        Telefone t;
//        SemFio s;
//        Celular c;
//        Celular d = null;
//
//        t = new Celular("123", 123, "123",123, new Dimensao(123, 123, 123), 123,123, 123, "Android" );
//        c = new Celular("123", 123, "123",123, new Dimensao(123, 123, 123), 123,123, 123, "Android" );
//
//        c.setSo("IOS");
//
//        d = (Celular) t;
//

//        Telefone tel1 = new Telefone("6485", 123, "modelo1", 500, new Dimensao(10, 10, 10) );
//        Telefone tel2 = new SemFio("111", 315, "modelo2", 658, new Dimensao(35,51,32), 87, 98, 446);
//        SemFio tel3 = (SemFio) tel2;
//
//
//        System.out.println(tel1.imprimirDados());
//        System.out.println(tel2.imprimirDados());
//        System.out.println(tel3.imprimirDados());
//
//        int f = (int) 2.5;
//        System.out.println(f);



    }
}
