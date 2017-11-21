package ru.pmishagin.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {


    @Test
    public void whenFirstLessSecond() {

        Max maxim = new Max();
        int result = maxim.max(2, 2);
        assertThat(result, is(2));
    }

    @Test

    public void whenFirstLessSecondLessThgird() {

        Max maxim = new Max();
        int result = maxim.max(7, 2, 5);
        assertThat(result, is(7));
    }
}
