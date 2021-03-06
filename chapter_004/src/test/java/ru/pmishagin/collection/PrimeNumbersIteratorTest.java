package ru.pmishagin.collection;

import org.junit.Test;
import ru.pmishagin.collection.iterator.PrimeNumbersIterator;
import ru.pmishagin.collection.iterator.PrimeNumbersIterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 14.12.2017
 */
public class PrimeNumbersIteratorTest {

    @Test

    public void whenweSearcPrimeNumbersNext() {

        int[] arr = new int[]{4, 4, 1, 6, 4};

        PrimeNumbersIterator itr = new PrimeNumbersIterator(arr);


        int result = (Integer) itr.next();

        assertThat(result, is(1));

    }

    @Test

    public void whenWeSearchElementPrimehasNext() {

        PrimeNumbersIterator itr = new PrimeNumbersIterator(new int[] {1, 7, 9, 4, 3, 9, 4});

        itr.next();
        itr.next();
        itr.next();


       boolean result = itr.hasNext();


        assertThat(result, is(false));



    }


}