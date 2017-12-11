package ru.pmishagin.iterator;

import java.util.Iterator;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 11.12.2017
 */
public class DoubleArrayIterator implements Iterator {

    private final int[][] values;
    private int index = 0;
    private int jindex = 0;

    public DoubleArrayIterator(final int[][] values) {

        this.values = values;
    }

    public boolean hasNext() {

     if (index == 1) {

         return values[1].length > jindex;

     }
        return values[index].length >= jindex;

    }

    public Object next() {

        if (jindex == values[index].length) {
            index++;
            jindex = 0;
        }

        return values[index][jindex++];

    }
}
