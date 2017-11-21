package ru.pmishagin.rally;

import ru.pmishagin.loop.Factorial;

import java.util.Arrays;

/**
 *  Massif class.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 01.11.2017
 */

public class Fructs2 {

//Перегрузка метода разными параметрами

    void summ(int a) {

        System.out.println("Это метод с 1ой переменной " + a);


    }
    void summ(int a, int b) {

        System.out.println("Это метод с 2мя переменными " + a + " и " + b);


    }

    int summ(int a, int b, int o) {

        int sum = a + b + o;

        return sum;

    }

}
class Fructs2Demo {

    public static void main(String[] args) {

        Fructs2 ob1 = new Fructs2();

        int sum;

        ob1.summ(26);

        ob1.summ(11, 22);

        sum = ob1.summ(11, 22, 33);

        System.out.println(sum);

    }
}








/*
    int [] filing(int n,int[] fil){




        for(int i = 0;i<n;i++){

            fil[i] = i+1;

        } return fil;


    }

    int[] factorial(int factor [],int n){


        int sum = 1;

        for(int x : factor){
            sum *= x;
            if (x==n) {
                break;
            }


        }return factor;

    }
*/

