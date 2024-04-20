package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // <condição seletora> ? <valor de retorno verdadeiro> : <valor de retorno falso>
        int a, b, aux;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the numbers: ");
        a = in.nextInt();
        b = in.nextInt();

        in.close();

        aux = a;
        a = (a > b) ? b : a;
        b = (a == b) ? aux : b;

        /*
        this is the same thing
        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }
        */

        System.out.println("Result: " + a + ", " + b);
    }
}
