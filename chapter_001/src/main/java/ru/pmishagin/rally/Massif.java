package ru.pmishagin.rally;

import java.util.Arrays;

/**
 *  Massif class.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 26.10.2017
 */
public class Massif {

    public static void main(String[] args) {

        int[] mas = {1, 2, 3, 4, 5, 6, 7};

        if (mas[mas.length - 1] > mas[0]) {

            int c = mas[0];

            mas[0] = mas[mas.length - 1];

            mas[mas.length - 1] = c;

        }
        System.out.println(Arrays.toString(mas));
    }
}