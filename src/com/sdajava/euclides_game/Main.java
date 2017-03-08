package com.sdajava.euclides_game;

public class Main {

    public static int gra (int a, int b) {

        while (a != b)
            if (a < b) {
                b = b - a;
            }
            else {
                a = a - b;
            }
        return b;
    }

    public static void main (String[] args){

        int a = 24;
        int b = 47;

        System.out.println("Pozostala liczba zetonow pozostajacych w grze to: " + gra(a,b));

    }
}
