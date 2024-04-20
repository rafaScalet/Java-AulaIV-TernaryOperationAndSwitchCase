package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        number = in.nextInt();
        in.close();

        switch (number) {
            case 1:
                System.out.println("Categoria " + number);
                break;
            case 2:
                System.out.println("Categoria " + number);
                break;
            case 3:
                System.out.println("Categoria " + number);
                break;
            default:
                break;
        }


        /*
        is the same thing
        switch (number) {
            case 1:
            case 2:
            case 3:
                System.out.println("Categoria " + number);
                break;
            default:
                break;
        }

        and this too
        if(number == 1 || number == 2 || number == 3){
            System.out.println("Categoria " + number);
        }
        */
    }
}
