package ru.pmishagin.rally;

/**
 *  Massif class.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 01.11.2017
 */

public class Fructs {


    int apple;
    int orange;
    int bananas;
    int[] gum;



    Fructs(int a, int o, int b) {

        this.apple = a;
        this.orange = o;
        this.bananas = b;


    }
    //Перегрузка конструктора(Разными вариантами)

    Fructs() {

        // Это делается чтобы создавать пустые конструкторы
         apple = -1;
         orange = -1;
         bananas = -1;



    }


    int summ() {

        return apple + orange + bananas;


    }

}
    class FructsDemo{

        public static void main(String[] args) {

            Fructs ob1 = new Fructs(25,32,33);

            Fructs ob2 = new Fructs();

            Fructs ob3 = new Fructs(37,32,22);

            int sum;

             sum = ob1.summ();

            System.out.println(sum); //смотрим на сумму






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

