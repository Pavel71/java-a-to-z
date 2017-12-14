package ru.pmishagin.iterator;

import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 14.12.2017
 */
public class PrimeNumbersIteratorTest {

    @Test

    public void whenweSearcPrimeNumbersNext() {

        int[] arr = new int[]{4, 2, 3, 5, 2, 4, 7, 8, 9, 10};

        PrimeNumbersIterator itr = new PrimeNumbersIterator(arr);



        int result = (Integer) itr.next();

        assertThat(result, is(2));

    }


}