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

public class BubleSortTest {

    @Test

    public void bubSortIfMaxMin() {

        BubleSort buble = new BubleSort();

        int[] array = {5, 2, 8, 12, 9, 7};

        int[] result = buble.sort(array);

        int[] expected = {2, 5, 7, 8, 9, 12};

        assertThat(result, is(expected));
    }
}