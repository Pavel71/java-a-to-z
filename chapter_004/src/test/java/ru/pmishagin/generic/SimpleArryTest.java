package ru.pmishagin.generic;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 18.12.2017
 */
public class SimpleArryTest {

    @Test

    public void whenCheckSimplaeArray() {

        SimpleArry<Integer> arr = new SimpleArry<>(10);

        arr.add(15);

        arr.update(25, 0);

        assertThat(25, is(arr.getindex(0)));

    }

}