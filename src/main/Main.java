package main;

public class Main {
    public static void main(String[] args) {
        int number = 0;

        while(number < 10){
            System.out.println("[number]" + number);
            number++;
        }

        /*
        is the same thing
        do{
            System.out.println("[number]" + number);
            number++;
        } while(number < 10);
        */
    }
}
