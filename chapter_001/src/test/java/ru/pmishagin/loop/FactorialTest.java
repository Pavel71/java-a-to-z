package ru.pmishagin.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class FactorialTest {


        @Test
        public void whenFactorialN() {
            Factorial sum = new Factorial();
            int n=5;
            int result = sum.calc(n);
            int expected = 120;
            assertThat(result, is(expected));
        }


}
