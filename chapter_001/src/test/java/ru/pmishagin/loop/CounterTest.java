package ru.pmishagin.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

    public class CounterTest {


        @Test
        public void whenSumdiv2StartFinsh() {
            Counter sum = new Counter();
            int result = sum.add(1, 5);
            int expected = 6;
            assertThat(result, is(expected));
        }

    }