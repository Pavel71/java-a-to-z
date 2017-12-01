package ru.pmishagin.convertlist;


import java.util.*;
import org.junit.Test;

import ru.pmishagin.convertlist.ConvertList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 01.12.2017
 */
public class ConvertListTest {

    @Test

    public void whenWeConvertDoubleArraytoList() {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}

        };

        List<Integer> list = new ConvertList().toList(arr);

        assertThat(list, is(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)));



    }

    @Test

    public void whenListInDoubleArray() {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        int[][] result = new ConvertList().toArray(list, 3);

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0} };

        assertThat(result, is(arr));


    }
}
