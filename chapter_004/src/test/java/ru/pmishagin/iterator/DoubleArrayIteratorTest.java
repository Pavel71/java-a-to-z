package ru.pmishagin.iterator;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 11.12.2017
 */
public class DoubleArrayIteratorTest {

    public static final class ForDoubleArray implements Iterable {

        private final int[][] values;

        public ForDoubleArray(final int[][] values) {

            this.values = values;
        }

        @Override

        public Iterator iterator() {

            return new DoubleArrayIterator(this.values);
        }
    }

    @Test

    public void whenIteratorDoubleArrayNext() {

        DoubleArrayIterator itr = new DoubleArrayIterator(new int[][] {{1, 2, 3},
                                                                      {5, 6, 7}});
        itr.next();
        itr.next();
        itr.next();
        itr.next();
        int result = (Integer) itr.next();

        assertThat(result, is(6));

    }

    @Test

    public void whenIteratorDoubleArrayHasNext() {

        DoubleArrayIterator itr = new DoubleArrayIterator(new int[][] {{1, 2, 3},
                                                                       {5, 6}});
        itr.next();
        itr.next();
        itr.next();
        itr.next();
        itr.next();

        boolean result = itr.hasNext();

        assertThat(result, is(false));

    }

    @Test

    public void foreach() {

        ForDoubleArray foreach = new ForDoubleArray(new int[][] {{1, 2, 3},
                                                                         {5, 6}});

        for (Object value : foreach) {

            System.out.println(value);
        }


    }
}
