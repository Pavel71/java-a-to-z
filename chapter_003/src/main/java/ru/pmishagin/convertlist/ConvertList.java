package ru.pmishagin.convertlist;

import java.util.*;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 01.12.2017
 */
public class ConvertList {


    public List<Integer> toList(int[][] array) {

        List<Integer> list = new ArrayList<>();

        for (int[] i : array) {

            for (int j : i) {

                list.add(j);

            }
        }

        return list;

    }




    public  int[][] toArray(List<Integer> list, int rows) {

        int cols = list.size() % rows == 0 ? list.size() / rows : list.size() / rows + 1;

        Iterator<Integer> iterator = list.iterator();

        int[][] array = new int[rows][cols];

        for (int index = 0; index < rows; index++) {

            for (int jindex = 0; jindex < cols && iterator.hasNext(); jindex++) {

                array[index][jindex] = iterator.next();
            }
        }
        return array;
    }
}
