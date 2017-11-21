package ru.pmishagin.array;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version $1.0$
 * @since 30.10.2017
 */

public class TurnTest {

    @Test

    public void whenArrFromOneToTen() {

        Turn turn = new Turn();

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] result = turn.back(array);

        int[] expected = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        assertThat(result, is(expected));
    }
}