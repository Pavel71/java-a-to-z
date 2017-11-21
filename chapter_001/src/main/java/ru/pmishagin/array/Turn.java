package ru.pmishagin.array;

import java.util.Arrays;

/**
 *  Massif class.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 26.10.2017
 */

public class Turn {

    /**
     * Метод back, переворачивает массив.
     * @param array массив.
     * @return перевернутый массив.
     */

    public int[] back(int[] array) {


        for (int i = 0; i < array.length / 2; i++) {

            int c = array[i];

            array[i] = array[array.length - 1 - i];

            array[array.length - 1 - i] = c;

        }
        return array;

    }



}






