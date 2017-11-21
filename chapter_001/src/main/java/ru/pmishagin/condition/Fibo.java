package ru.pmishagin.condition;


public class Fibo {

    public static void main(String[] args) {

        int i;
        int a = 1;
        int b = 1;
        int c;

        for (i = 0; i < 10; i++) {

            c = a + b;
            a = b;
            b = c;


            System.out.println("I = " + c);
        }
    }
}