package ru.pmishagin.iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 18.12.2017
 */
public class ConvertIteratorTest {

    @Test

    public void whenConvertIterator() {

        ConvertIterator convertitr = new ConvertIterator();

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2));

        List<Integer> list2 = new ArrayList<>(Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20));


        Iterator<Integer> itrint1 = list1.iterator();
        Iterator<Integer> itrint2 = list2.iterator();

        List<Iterator<Integer>> listIterator = Arrays.asList(itrint1, itrint2);

        Iterator<Iterator<Integer>> it = listIterator.iterator();

        Iterator<Integer> iterator = convertitr.convert(it);

        iterator.next();
        iterator.next();
        int result = iterator.next();

        assertThat(result, is(11));

    }

}