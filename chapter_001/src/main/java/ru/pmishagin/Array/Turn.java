package ru.pmishagin.Array;

import java.util.Arrays;

/**
 *  Massif class.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 26.10.2017
 */

public class Turn {


    public static void main(String[] args) {


        int[] numbers = new int[]{1,2,3,4,5};

       int result = 0;


        for (int i=0;i<numbers.length / 2;i++) {

             int c = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = numbers[i];
            numbers[i] = c;

             System.out.println(numbers[i]);
        }







    }
}






