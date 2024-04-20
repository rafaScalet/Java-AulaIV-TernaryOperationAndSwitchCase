package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ch = "";
        Scanner in = new Scanner(System.in);

        do{
            System.out.println("Would you like to exit? <Y/N>");
            ch = in.next().toUpperCase();
        } while(!ch.equals("Y"));

        in.close();
    }
}
