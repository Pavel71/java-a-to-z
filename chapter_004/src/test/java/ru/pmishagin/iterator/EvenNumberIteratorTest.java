package ru.pmishagin.iterator;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 12.12.2017
 */
public class EvenNumberIteratorTest {

    @Test

    public void whenWeSearchElementEvenNext() {

        EvenNumberIterator itr = new EvenNumberIterator(new int[] {2, 13, 11, 5, 12, 5, 7});

        itr.next();

        int result = (Integer) itr.next();

        assertThat(result, is(12));
    }

    @Test

    public void whenWeSearchElementEvenhasNext() {

        EvenNumberIterator itr = new EvenNumberIterator(new int[] {1, 2, 24, 3, 21, 7});

        itr.next();
        itr.next();

        itr.hasNext();

        boolean result = itr.hasNext();

        assertThat(result, is(false));
    }
}