package ru.pmishagin.array;

/**
 *  Massif class.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 30.10.2017
 */

/**
 * @param array исходный массив
 * @param rotatedArray перевернутый массив
 * @return возвращает перевернутый массив
 *
 */
public class RotateArray {


    public int[][] rotate(int[][] array) {

        int dX = array.length;

        int dY = array[0].length;

        int[][] rotatedArray = new int[dY][dX];

        for (int i = 0; i < dX; i++) {

            for (int j = 0; j < dY; j++) {

                rotatedArray[j][dX - 1 - i] = array[i][j];
            }
        }
        return rotatedArray;
    }
}









